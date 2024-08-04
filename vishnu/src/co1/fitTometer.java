package co1;
import java.util.Scanner;
//draw the class diagram and code the logic to read the number of meters (of type double), through 
//console,converts it tofeet displays the result.(HINT:- 1meter =3.3786feet
public class fitTometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f1,m1,f2,m2=20;
		System.out.println("Feet Meter | Meter Feet");
		System.out.println("______________________");
		for(int i=1;i<=10;i++)
		{
			f1=i;
			m1=i*0.305;
			f2=3.279*m2;
			System.out.println(f1+"   "+m1+" "+"|"+m2+"  "+f2);
			m2=m2+5;
		}
		//meter to feet
		double meter;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length in meters");
		meter=sc.nextDouble();
		double feet=meter*3.2786;
		System.out.println("Feet ="+feet);
		/*in the main method
		 * double meter;
		 * scanner in =new scanner(sysin)
		 * meter=
		 */
	}

}
