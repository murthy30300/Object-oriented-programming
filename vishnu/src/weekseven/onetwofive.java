package weekseven;

import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }
    
}

public class onetwofive {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the title");
      String title=sc.nextLine();
      MyBook new_novel=new MyBook();
      new_novel.setTitle(title);
      System.out.println("The title is: "+new_novel.getTitle());
    }
}

