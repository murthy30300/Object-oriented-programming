package Decorator;
interface Beverage 
{
  void prepare();
  String getDescription();
  double getPrice();
}

class Coffee implements Beverage {
  public void prepare() {
    System.out.println("Brewing coffee...");
  }

  public String getDescription() {
    return "Coffee";
  }

  public double getPrice() {
    return 1.0;
  }
}

class MilkDecorator implements Beverage {
  private Beverage beverage;

  public MilkDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public void prepare() {
    beverage.prepare();
    System.out.println("Adding milk...");
  }

  public String getDescription()
  {
   return beverage.getDescription() + " with milk";
  }

  public double getPrice() {
    return beverage.getPrice() + 0.5;
  }
}

public class DecoratorPatternDemo {
  public static void main(String[] args) 
  {
    Beverage coffee = new Coffee();
    System.out.println(coffee.getDescription() + " - $" + coffee.getPrice());

    Beverage coffeeWithMilk = new MilkDecorator(coffee);
    System.out.println(coffeeWithMilk.getDescription() + " - $" + coffeeWithMilk.getPrice());
  }
}
