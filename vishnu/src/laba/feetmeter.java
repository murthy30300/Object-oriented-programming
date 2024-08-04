package laba;

public class feetmeter {
	public static void main() {
		double f1,m1,f2,m2;
		System.out.print("Feet Meter | Meter Feet");
		System.out.println("______________________");
		for(int i=1;i<=10;i++)
		{
			f1=i;
			m1=i*0.305;
			m2=20;
			f2=3.279*m2;
			System.out.println(f1+"   "+m1+"    "+"|"+m2+"     "+f2);
			m2=m2+5;
		}
	}
}
