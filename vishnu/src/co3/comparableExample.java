package co3;
import java.util.ArrayList;
import java.util.Comparator;

public class comparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Dog> d=new ArrayList<>();
		d.add(new Dog("Riyo","Lab"));
		d.add(new Dog("Rocky","German"));
		d.add(new Dog("Dabur","Daburmann"));
		
		System.out.println("Before Sorting");
		
		for(int i=0;i<d.size();i++)
			System.out.println(d.get(i));
		
		d.sort(new Comparator<Dog>() {
			public int compare(Dog d1,Dog d2)
			{
				return d1.breed.compareTo(d2.breed);
			}
		});
		System.out.println("********************After sorting*******************");
		for(Dog i:d)
		{
			System.out.println(i);
		}

	}

}
class Dog implements Comparable<Dog>
{
	String name;
	String breed;
	Dog(String n,String b)
	{
		name=n;
		breed=b;
	}
	public String toString()
	{
		return name+" "+breed+" ";
	}
	public int compareTo(Dog another)
	{
		return this.name.compareTo(another.breed);
	}
	
	
}