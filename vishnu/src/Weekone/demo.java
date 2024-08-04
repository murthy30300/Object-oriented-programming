package Weekone;


public class Employe
{
	String name;
	String empId;
	Employe(String empId,String name)
	{
		this.name=name;
		this.empId=empId;
	}

void print()
{
	System.out.println("ID="+empId);
	System.out.println("Name="+name);
}
}
class Accountant extends Employe
{
	String skill;
	Accountant(String empId,String name,String skill)
	{
		super(empId,name);
		this.skill=skill;
	}
	void print()
	{
		System.out.println("Accountang Details");
		System.out.println("_________________________");
		super.print();
		System.out.print("skill:"+skill);
		System.out.println("_________________________");
		
	}
}
class manager extends Employe
{
	Accountant accountant;
	String project;
	manager(String empId,String name, String ,String project)
	{
		super(empId,name);
		this.accountant=;
		this.project=project;
	}
}
class demo
{
	public static void main(String[] args)
	{
		Accountant ramu=new Accountant("ACLOL","Ramu","Tally");
		manager seenu =new manager("moo1","srinivas","ramu","sewage");
		ramu.print();
		seenu.print();
	}
}