

package Co1;

import java.util.*;
class Students {  
    int rollno;  
    String name;  
    int age;  
    Students(int rollno,String name,int age)
    {  
    	this.rollno=rollno;  
    	this.name=name;  
    	this.age=age;  
    }  
}
class AgeComparator implements Comparator<Students> {
	public int compare(Students s1,Students s2)
	{  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}
}
class RollnoComparator implements Comparator<Students> {
	public int compare(Students s1,Students s2)
	{  
		if(s1.rollno==s2.rollno)  
			return 0;  
		else if(s1.rollno>s2.rollno)  
			return 1;  
		else  
			return -1;  
	} 
}

public class ComparatorCode {
	public static void main(String args[])
	{    
		ArrayList<Students> al=new ArrayList<Students>();  
		al.add(new Students(101,"Vijay",23));  
		al.add(new Students(106,"Ajay",27));  
		al.add(new Students(105,"Jai",21));  
		System.out.println("Sorting by rollno.");  
		Collections.sort(al,new RollnoComparator());  
		for(Students st: al)
		{  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
		System.out.println("sorting by Age");  
		Collections.sort(al,new AgeComparator());
		for(Students st: al)
		{  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}   
	}  

}