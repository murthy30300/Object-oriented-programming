package weekseven;

import java.io.*;
import java.util.*;

public class OneTwoFour {
    private int age;    
  
    OneTwoFour(int initialAge){
        if(initialAge>0)
            this.age=initialAge;
        else{
            this.age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    public void yearPasses(){
        this.age++;
    }
    public void amIOld(){
        if(age<13)
            System.out.println("You are young.");
        else if(age>=13&&age<18){
            System.out.println("You are a teenager.");
        }
        else
            System.out.println("You are old.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            OneTwoFour p = new OneTwoFour(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

