package co2;
import java.util.Scanner;
public class Student
{
private String ID;
private String name;
private char gender;
private String branch;

public String ToString()
{
	String msg;
	msg="Name:"+name;
	msg+="\nID:"+ID;
	msg+="\n Gender:"+gender;
	msg+="\n Branch:"+branch;
	return msg;
}
String getID()
{
	return ID;
}
void SetID(String ID)
{
	boolean status=false;
	while(!status)
	{
		if(ID.length()==9)
		{
			status=true;
			for(int i=0;i<ID.length();i++)
			{
				char c=ID.charAt(i);
				if(c>='0'&&c<='9')
					status=true;
				else
				{
					status=false;
					break;
				}
			}
		}
		else
			status=false;
		if(status)
			this.ID=ID;
		else
		{
			Scanner in=new Scanner(System.in);
			System.out.println("This ID is INVALID !please enter a Valid ID");
			ID=in.next();
		}
	}
}
String getName()
{
	return name;
}
void SetName(String name)
{
	boolean status=false;
	while(!status)
	{
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			if((c>='a'&&c<='z')||(c>'A'&&c<='Z'))
				status=true;
			else
			{
				status=false;
				break;
			}
		}
		if(status)
			this.name=name;
		else
		{
			Scanner input=new Scanner(System.in);
			System.out.println("This is invalid please enter a VALID one");
			name=input.next();
		}
	}
}
char getGender()
{
	return gender;
}
void SetGender(char gender)
{
	boolean status=false;
	while(!status)
	{
		
		if(gender!='M'&&gender!='F')
			status=false;
		else
			status=true;
		if(status)
		this.gender=gender;
		else
		{
			System.out.println("INVALID gender please enter VALID one");
			Scanner input=new Scanner(System.in);
			gender=input.next().charAt(0);
		}
	}
}
String getBranch()
{
	return branch;
}
void SetBranch(String branch)
{
	boolean status=false;
	while(!status)
	{
		switch(branch)
		{
		case "CSE":
			status=true;
			break;
		case "ECSE":
			status=true;
			break;
		case "ECE":
			status=true;
			break;
		case "ME":
			status=true;
			break;
		case "CE":
			status=true;
			break;
		case "BT":
			status=true;
			break;
		case "EEE":
			status=true;
			break;
		default:
			status=false;
		}
		if(status)
			this.branch=branch;
		else
		{
			System.out.println("INVALID branch please enter VALID one");
			Scanner input=new Scanner(System.in);
			branch=input.next();
			
		}
	}
}
	public static void main(String[] args)
	{
		Student s=new Student();
		//System.out.println(s);
		s.SetName("abc");
		s.SetID("200010000");
		s.SetBranch("CSE");
		s.SetGender('M');
		System.out.println(s.ToString());
		}
}
