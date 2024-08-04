package weekeight;
//141
import java.util.*;
class Item {
 private String name;
 private int id;
 private double cost;

 public Item(String name, int id, double cost) {
 this.name = name;
 this.id = id;
 this.cost = cost;
 }
 public String getName() {
 return name;
 }
 public int getId() {
 return id;
 }
 public double getCost() {
 return cost;
 }
 public String toString() {
 return "Name: " + name + ", Id: " + id + ", Cost: " + cost;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 LinkedList<Item> itemList = new LinkedList<Item>();
 while (true) {
 System.out.print("Enter item name (or 'quit' to exit): ");
 String name = scanner.nextLine();
 if (name.equals("quit")) {
 break;
 }
 System.out.print("Enter item id: ");
 int id = scanner.nextInt();
 System.out.print("Enter item cost: ");
 double cost = scanner.nextDouble();
 scanner.nextLine();

 Item item = new Item(name, id, cost);
 itemList.add(item);
 }
 Collections.sort(itemList, new Comparator<Item>() {
 public int compare(Item item1, Item item2) {
 return Double.compare(item1.getCost(), item2.getCost());
 }
 });
 System.out.println("\nItems sorted by cost in ascending order:");
 for (Item item : itemList) {
 System.out.println(item);
 }
 }

}