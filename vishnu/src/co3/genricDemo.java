package co3;

import java.lang.reflect.Array;

public class genricDemo 
{
    public static void main(String[] args)
	{
    	Integer[] iarray= {10,20,30};
    	Float[] farray= {.1f,.2f,.3f};
    	/*Student s1=new Student("Ram");
    	 * Student s2= new Student("Bhim");
    	 * Student[] sarray={s1,s2}
       	 */
    	display(iarray);
    	display(farray);
    	//display(sarray);
    	
		/*display(29);
		display(.5f);
		display(new Student("Ram"));
		display(new Elephant());
		display(false);
		display(hello);
		*/
		
	}
	//normal methods
	/*static void display(int x)
	{
		System.out.println(x);
	}
	static void display(float x)
	{
		System.out.println(x);
	}
	static void display(Student x)
	{
		System.out.println(x);
	}*/
	//generic method
	static <T> void display(T x)
	{
		for(int i=0;i<);)
		System.out.println(x);
	}

}
//public class Student
{
