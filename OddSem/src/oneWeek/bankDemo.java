package oneWeek;
//. In a Banking process, create a Singleton pattern to manage the Login state of the user in all the operations like View Balance, Deposit & Withdraw.  
//Note: Create a Singleton Class to maintain the User Login-State
/*import java.util.Scanner;
 */

class bank{
	private static bank balance=null;
	private boolean isLoggedIn=false;
	private bank()
	{
		
	}
	public static bank getBalance()
	{
		if(balance==null)
			balance=new bank();
		return balance;
	}
	//Scanner sc=new Scanner(System.in);
	public boolean isLoggedIn()
	{
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn)
	{
		this.isLoggedIn=isLoggedIn;
	}
	
}
public class bankDemo
{

	public static void main(String[] args) {
		bank loginState = bank.getBalance();

	        // Check if the user is logged in
	        if (loginState.isLoggedIn()) {
	            System.out.println("The user is logged in.");
	        } else {
	            System.out.println("The user is not logged in.");
	        }

	        // Log the user in
	        loginState.setLoggedIn(true);

	        // Check if the user is logged in again
	        if (loginState.isLoggedIn()) {
	            System.out.println("The user is logged in.");
	        } else {
	            System.out.println("The user is not logged in.");
	        }

	}

}
