package weekeight;

import java.util.Scanner;
import java.util.Vector;
public class ShortestWordFinder {
 public static void main(String[] args) {
 Scanner i = new Scanner(System.in);
 Vector<String> movies = new Vector<String>();
 System.out.println("Enter movie names (type 'done' to finish): ");
 String movieName = i.nextLine();
 while (!movieName.equals("done")) {
 movies.add(movieName);
 movieName = i.nextLine();
 }
 String shortestWord = movies.get(0);
 for (int in = 1; in < movies.size(); in++) {
 String currentWord = movies.get(in);
 if (currentWord.length() < shortestWord.length()) {
 shortestWord = currentWord;
 }
 }
 System.out.println("Shortest word: " + shortestWord);
 }
}
