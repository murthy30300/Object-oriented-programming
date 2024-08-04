package factory;
/*: Create a game where there are multiple levels with different difficulty settings. 
Use the Singleton pattern to manage the game state, the Factory Method pattern 
to create different types of enemies,
and the Abstract Factory pattern to create different types of weapons and power-ups. */
//Singleton Game Manager
 class GameManager {
 private static GameManager instance;

 private GameManager() {
     // Private constructor to prevent instantiation
 }

 public static GameManager getInstance() {
     if (instance == null) {
         synchronized (GameManager.class) {
             if (instance == null) {
                 instance = new GameManager();
             }
         }
     }
     return instance;
 }

 // Other game management methods and properties
 public void startGame() {
     // Start the game
 }

 public void endGame() {
     // End the game
 }
}

//Abstract Factory for creating weapons and power-ups
abstract class AbstractPowerUpFactory {
 public abstract Weapon createWeapon();
 public abstract PowerUp createPowerUp();
}

//Concrete Factory for creating weapons and power-ups for level 1
 class Level1PowerUpFactory extends AbstractPowerUpFactory {
 @Override
 public Weapon createWeapon() {
     return new BasicWeapon();
 }

 @Override
 public PowerUp createPowerUp() {
     return new HealthPowerUp();
 }
}

//Concrete Factory for creating weapons and power-ups for level 2
class Level2PowerUpFactory extends AbstractPowerUpFactory {
 @Override
 public Weapon createWeapon() {
     return new AdvancedWeapon();
 }

 @Override
 public PowerUp createPowerUp() {
     return new ShieldPowerUp();
 }
}

//Abstract Product - Weapon
interface Weapon {
 void attack();
}

//Concrete Product - Basic Weapon
 class BasicWeapon implements Weapon {
 @Override
 public void attack() {
     System.out.println("Basic weapon attack");
 }
}

//Concrete Product - Advanced Weapon
 class AdvancedWeapon implements Weapon {
 @Override
 public void attack() {
     System.out.println("Advanced weapon attack");
 }
}

//Abstract Product - Power-up
interface PowerUp {
 void activate();
}

//Concrete Product - Health Power-up
 class HealthPowerUp implements PowerUp {
 @Override
 public void activate() {
     System.out.println("Health power-up activated");
 }
}

//Concrete Product - Shield Power-up
 class ShieldPowerUp implements PowerUp {
 @Override
 public void activate() {
     System.out.println("Shield power-up activated");
 }
}

//Factory Method for creating enemies
 interface EnemyFactory {
 Enemy createEnemy();
}

//Concrete Factory for creating Easy Enemies
 class EasyEnemyFactory implements EnemyFactory {
 @Override
 public Enemy createEnemy() {
     return new EasyEnemy();
 }
}

//Concrete Factory for creating Hard Enemies
 class HardEnemyFactory implements EnemyFactory {
 @Override
 public Enemy createEnemy() {
     return new HardEnemy();
 }
}

//Abstract Product - Enemy
 interface Enemy {
 void attack();
}

//Concrete Product - Easy Enemy
 class EasyEnemy implements Enemy {
 @Override
 public void attack() {
     System.out.println("Easy enemy attack");
 }
}

//Concrete Product - Hard Enemy
 class HardEnemy implements Enemy {
 @Override
public void attack() {
     System.out.println("Hard enemy attack");
 }
}

//Game level class
 class GameLevel {
 private AbstractPowerUpFactory powerUpFactory;
 private EnemyFactory enemyFactory;

 public GameLevel(AbstractPowerUpFactory powerUpFactory, EnemyFactory enemyFactory) {
     this.powerUpFactory = powerUpFactory;
     this.enemyFactory = enemyFactory;
 }

 public void startLevel() {
     Weapon weapon = powerUpFactory.createWeapon();
     PowerUp powerUp = powerUpFactory.createPowerUp();
     Enemy enemy = enemyFactory.createEnemy();

     weapon.attack();
     powerUp.activate();
     enemy.attack();
 }
}

//Main class
public class gameDemo {
 public static void main(String[] args) {
	 GameManager gameManager = GameManager.getInstance();

     // Start the game
     gameManager.startGame();

     // Create different game levels
     AbstractPowerUpFactory level1PowerUpFactory = new Level1PowerUpFactory();
     AbstractPowerUpFactory level2PowerUpFactory = new Level2PowerUpFactory();

     // Create a game level for level 1
     GameLevel level1 = new GameLevel(level1PowerUpFactory, new EasyEnemyFactory());
     level1.startLevel();

     // Create a game level for level 2
     GameLevel level2 = new GameLevel(level2PowerUpFactory, new HardEnemyFactory());
     level2.startLevel();
 }
}
