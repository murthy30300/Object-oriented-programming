package adapter;
public class adapterDemo 
{
	public static void main(String[] args)
	{
		//PilotPen oo=new PilotPen();
		Pen p=new penAdapter();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am a bit tired to write the assignment");
	}
}
class AssignmentWork
{
	private Pen p;
	public Pen getP()
	{
		return p;
	}
	public void setP(Pen p)
	{
		this.p=p;
	}
	public void writeAssignment(String str)
	{
		p.write(str);
	}
}
class penAdapter implements Pen
{
	PilotPen pp=new PilotPen();
	public void write(String str)
	{
		pp.mark(str);
	}
}
class PilotPen
{
	public void mark(String str)
	{
		System.out.println(str);
	}
}
interface Pen
{
	void write(String str);
}
