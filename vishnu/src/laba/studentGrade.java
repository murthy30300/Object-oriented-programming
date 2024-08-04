package laba;
import java.util.Scanner;
public class studentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade;
		Scanner input=new Scanner(System.in);
		System.out.println("enter your score");
		score=Integer.parseInt(input.next());
		if(score<50)
			grade='F';
		else if(score>=50 && score<60)
			grade='E';
		else if(score>=60 && score<70)
			grade='D';
		else if(score>=70 && score<80)
			grade='C';
		else if(score>=80 && score<90)
			grade='B';
		else if(score>=90 && score<100)
			grade='A';
		else
			grade='O';
		System.out.println("Your grade is " +grade);

	}

}
