package project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class projectThree
{
  public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new BillWindow("BILL");
			}
		});
	}
}
class BillWindow extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JComboBox <String> c1,c2,c3;
	int sum=0;
	JButton bcal;
	JFrame a;
	int k=0,i;
	double []f=new double[3];
	String[] items= {"Food", "Rice","Fried Rice","Biriyani"};
	String [] items1= {"Fashion","Shirt","Trouser","Jacket"};
	String [] items2= {"Electronics","Charger","headset","Mouse"};
	//prices
	  double[] pr1={0,150.0, 200.0, 300.0};
      double[] pr2={0,1250.0, 2000.0, 4000.0};
      double[] pr3={0,1500.0, 2000.0, 1000.0};
     //discounts
      double[] d1= {0,10,15,20};
      double[] d2= {0,125,200,300};
      double[] d3= {0,50,100,100};
      
      double p,d;
	
	
	
	BillWindow(String title)
	{
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a=new JFrame();
		a.setLayout(null);
		a.setSize(400,500);
		
		l1=new JLabel("Category1");
		l1.setBounds(100,40,70,60);
		a.add(l1);
		
		c1=new JComboBox<String>(items);
		c1.setBounds(200,40,120,45);
		a.add(c1);
		
		l2=new JLabel("Category2");
		l2.setBounds(100, 120, 70, 60);
		a.add(l2);
		
		c2=new JComboBox<String>(items1);
		c2.setBounds(200, 120, 120, 45);
		a.add(c2);
		

		l3=new JLabel("Category3");
		l3.setBounds(100, 190, 70, 60);
		a.add(l3);
		
		c3=new JComboBox<String>(items2);
		c3.setBounds(200, 190, 120, 45);
		a.add(c3);
		
		bcal=new JButton("Calculate");
		bcal.setBounds(160,280,150,30);
		a.add(bcal);
		
		a.setVisible(true);
		bcal.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bcal)
		{
			System.out.println(c1.getSelectedItem());
			i=c1.getSelectedIndex();
			if(i!=0)
			{
				p=pr1[i];
				d=d1[i];
				System.out.println("Price:"+p+"\n"+"Discount:"+d+"\n"+"Final Price:"+(p-d));
				f[k]=(p-d);
				k++;
				
			}
			System.out.println(c2.getSelectedItem());
			i=c2.getSelectedIndex();
			if(i!=0)
			{
				p=pr2[i];
				d=d2[i];
				System.out.println("Price:"+p+"\n"+"Discount:"+d+"\n"+"Final Price:"+(p-d));
				f[k]=(p-d);
				k++;
				
			}
			System.out.println(c2.getSelectedItem());
			i=c2.getSelectedIndex();
			if(i!=0)
			{
				p=pr3[i];
				d=d3[i];
				System.out.println("Price:"+p+"\n"+"Discount:"+d+"\n"+"Final Price:"+(p-d));
				f[k]=(p-d);
				k++;
				
			}
			 for(int m=0;m<k;m++)
	    	   {
	    		   sum+=f[m];
	    	   }
			 
	    	   System.out.println("Bill Amout:"+sum);
	    	   File d=new File("D:\\BILLING SYSTEM.txt");
				PrintStream p=null;
				try {
					p = new PrintStream(d);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

				p.println("************BILL**************");
				p.println(c1.getSelectedItem());
				p.println(c2.getSelectedItem());
				p.println(c3.getSelectedItem());
				p.println("Bill Amount : "+sum);
				p.println("***********THANK YOU FOR VISITING**************");
	    	   		
		}
		
	}
	
}