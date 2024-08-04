package connect;
import java.sql.*;
public class dbcone {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		//hr and hr also working
		if(con!=null) {
			System.out.println("Connection successfull");
		}
		else {
			System.out.println("Connection get failed");
		}
		con.close();

	}

}
 