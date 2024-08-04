import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBCCreate {
	  public static void main( String args[] ) {
	      Connection c = null;
	      
	      String creating = "create table student534 (rollno integer,name varchar(200),age integer)";
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "Vishnu1702@");
	         //c.setAutoCommit(false);
	         if(c==null)
	         {
	        	 System.out.println("Connection Failed");
	         }
	         else
	         {
	         System.out.println("Opened database successfully");
	         }
	         Statement stmt = c.createStatement();
	         stmt.executeUpdate(creating);
	         System.out.println("Table Created successfully");
	         
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }

	   }
}
