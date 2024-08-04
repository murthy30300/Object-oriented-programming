package chainOfResposibility;
public class logDemo 
{
	private static AbstractLogger getOfChainLog()
	{
		AbstractLogger errorLogger=new errorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger =new fileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger= new consoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
		
	}
	public static void main(String[] args) 
	{
		AbstractLogger logerchain=getOfChainLog();
		logerchain.logMessage(AbstractLogger.INFO,"This is an information");
		logerchain.logMessage(AbstractLogger.DEBUG,"This is a DEBUG level message");
		logerchain.logMessage(AbstractLogger.ERROR,"this is an error message");
		
	}
}
abstract class AbstractLogger
{
	public static int INFO=1,DEBUG=2,ERROR=3;
	protected int level;
	protected AbstractLogger nextLogger;
	public void setNextLogger(AbstractLogger nextLogger)
	{
		this.nextLogger=nextLogger;
	}
	public void logMessage(int level, String message)
	{
		if(this.level<=level)
		{
			write(message);
		}
		if(nextLogger!=null)
		{
			nextLogger.logMessage(level, message);
		}
	}
	abstract protected void write(String message);
}
class consoleLogger extends AbstractLogger
{
	public consoleLogger(int level)
	{
		this.level=level;
	}
	protected void write(String message)
	{
		System.out.println("Standard Console ::Logger:"+message);
	}
}
class errorLogger extends AbstractLogger
{
	public errorLogger(int level)
	{
		this.level=level;
	}
	protected void write(String message)
	{
		System.out.println("ERROR CONSOLE:: lOGGER:"+message);
	}
}
class fileLogger extends AbstractLogger
{
	public fileLogger(int level)
	{
		this.level=level;
	}
	protected void write(String message)
	{
		System.out.println("File::Logger:"+message);
	}
}