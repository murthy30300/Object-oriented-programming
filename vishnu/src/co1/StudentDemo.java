package co1;
import java.util.Scanner;

public class StudentDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
class Details
{
	private String name;
	private String id;
	private String mobile;
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setMobile( String mobile)
	{
		this.mobile=mobile;
	}
	public void display()
	{
		String msg;
		msg="name:\n"+name;
		msg="ID:\n"+id;
		msg="Mobile:\n"+mobile;
		return msg;
				
	}
}
