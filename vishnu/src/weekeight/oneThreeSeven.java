package weekeight;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class oneThreeSeven {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 Vector<String> countries = new Vector<String>();
 int choice;
 do {
 System.out.println("1. Add a country");
 System.out.println("2. Search for a country");
 System.out.println("3. Sort based on country name");
 System.out.println("4. Exit");
 System.out.print("Enter your choice: ");
 choice = input.nextInt();
 input.nextLine();
 switch (choice) {
 case 1:
 System.out.print("Enter a country name: ");
 String country = input.nextLine();
 countries.add(country);
 System.out.println("Country added.");
 break;
 case 2:
 System.out.print("Enter a country name to search for: ");
 String searchCountry = input.nextLine();
 if (countries.contains(searchCountry)) {
 System.out.println(searchCountry + " found.");
 } else {
 System.out.println(searchCountry + " not found.");
 }
break;
 case 3:
 Collections.sort(countries);
 System.out.println("Countries sorted.");
 break;
 case 4:
 System.out.println("Exiting program.");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 4);
 }
}
