package co3;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class CountryNames {
   public static void main(String[] args) {
      Vector<String> countries = new Vector<String>();
      Scanner scanner = new Scanner(System.in);
      // Read country names from user input and add to vector
      System.out.println("Enter country names (one per line):");
      while (scanner.hasNextLine())
      {
         String country = scanner.nextLine();
         if (country.isEmpty()) 
         {
            break;
         }
         countries.add(country);
      }
      // Menu-driven options
      while (true) 
      {
         System.out.println("\n1. Search for a country name");
         System.out.println("2. Sort based on country name");
         System.out.println("3. Exit");
         System.out.print("Enter option number: ");
         int option = scanner.nextInt();

         switch (option)
         {
            case 1:
               // Search for a country name
               System.out.print("Enter country name to search: ");
               scanner.nextLine(); // consume newline
               String search = scanner.nextLine();
               int index = countries.indexOf(search);
               if (index == -1) 
               {
                  System.out.println("Country not found.");
               } 
               else
               {
                  System.out.println("Country found at index " + index);
               }
               break;
            case 2:
               // Sort based on country name
               Collections.sort(countries);
               System.out.println("Country names sorted.");
               System.out.println(countries);
               break;
            case 3:
               // Exit
               System.out.println("Exiting program.");
               System.exit(0);
            default:
               System.out.println("Invalid option. Try again.");
         }
      }
   }
}
