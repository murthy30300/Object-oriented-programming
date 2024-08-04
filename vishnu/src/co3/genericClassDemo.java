package co3;

import java.util.ArrayList;

public class genericClassDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyStack<Integer> s=new MyStack<Integer>();
		s.push(10);
		s.push(20);
		Integer i=s.pop();
		System.out.println("after pop \n");
		s.showAll();
		MyStack<String> s2= new MyStack<String>();
		s2.push("10");
		s2.push("HI");

	}

}
class MyStack<T>
{
	private ArrayList<T> values;
	private int top;
	MyStack()
	{
		values= new ArrayList<T>();
		top=-1;
	}
	void push(T i)
	{
		values.add(i);
		top++;
	}
	T pop()
	{
		T i=values.remove(top);
		top--;
		return i;
	}
	T peak()
	{
		return values.get(top);
	}
	void showAll()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(values.get(i));
		}
	}
	
	
}
