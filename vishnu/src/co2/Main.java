package co2;

import java.util.Scanner;

class CountryTime {
    private int hr, min, sec;
    private String countryName;
    
    public CountryTime(String countryName, int hr, int min, int sec) {
        this.countryName = countryName;
        setHr(hr);
        setMin(min);
        setSec(sec);
    }
    
    public void setHr(int hr) {
        if (hr >= 0 && hr <= 23) {
            this.hr = hr;
        } else {
            System.out.println("Invalid hour input. Hour should be between 0-23.");
        }
    }
    
    public void setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            System.out.println("Invalid minute input. Minute should be between 0-59.");
        }
    }
    
    public void setSec(int sec) {
        if (sec >= 0 && sec <= 59) {
            this.sec = sec;
        } else {
            System.out.println("Invalid second input. Second should be between 0-59.");
        }
    }
    
    public String toString() {
        return "Current Time in " + countryName + " is " + String.format("%02d", hr) + " hrs " 
            + String.format("%02d", min) + " mins " + String.format("%02d", sec) + " secs";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        CountryTime[] countries = new CountryTime[10];
        int index = 0;
        
        do {
            System.out.println("\nMenu");
            System.out.println("1. Add new Country Time");
            System.out.println("2. Display Time of all countries");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    input.nextLine(); // clear input buffer
                    System.out.print("Enter country name: ");
                    String countryName = input.nextLine();
                    System.out.print("Enter hour (0-23): ");
                    int hr = input.nextInt();
                    System.out.print("Enter minute (0-59): ");
                    int min = input.nextInt();
                    System.out.print("Enter second (0-59): ");
                    int sec = input.nextInt();
                    countries[index] = new CountryTime(countryName, hr, min, sec);
                    index++;
                    break;
                case 2:
                    System.out.println("\nDisplay Time of all countries");
                    for (int i = 0; i < index; i++) {
                        System.out.println(countries[i].toString());
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
            
        } while (choice != 0);
        
        input.close();
    }
}
