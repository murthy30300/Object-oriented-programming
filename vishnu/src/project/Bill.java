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
public class Bill implements ActionListener
{
	int sum=0;
       JFrame j;
       JLabel l1,l2,l3,l4;
       JComboBox<String> cb1,cb2,cb3;
       JButton b1;
       int k=0,i;
       double p,d;
       double[] f=new double[3];
       String[] items = {"Food","Burger","Pizza", "Sandwich"};
       String[] items1={"Clothing","Shirt", "T-Shirt", "Jeans"};
       String[] items2={"Electronics","TV", "Laptop", "Mobile"};
       //Prices
       double[] p1={0,50.0, 100.0, 80.0};
       double[] p2={0,25.0, 20.0, 50.0};
       double[] p3={0,500.0, 1000.0, 800.0};
       //Discount Values
       double[] d1= {0,10,15,20};
       double[] d2= {0,11,12,13};
       double[] d3= {0,200,500,300};
       public static void main(String args[])
       {
    	   new Bill();
       }
       Bill()
       {
    	  j=new JFrame("KL STORE");
   	   	  j.setLayout(null);
   		  j.setSize(500,500);
   		  l1=new JLabel("Category1:");
   		  l1.setBounds(100, 50, 70, 60);
   		  j.add(l1);
   		  cb1= new JComboBox<String>(items);
          cb1.setBounds(200, 50, 120, 45);
          j.add(cb1);
          l2 = new JLabel("Category2:");
          l2.setBounds(100, 120, 70, 60);
          j.add(l2);
          cb2 = new JComboBox<String>(items1);
          cb2.setBounds(200, 120, 120, 45);
          j.add(cb2);
          l3 = new JLabel("Category3:");
          l3.setBounds(100, 190, 70, 60);
          j.add(l3);
          cb3 = new JComboBox<String>(items2);
          cb3.setBounds(200, 190, 120, 45);
          j.add(cb3);	
          b1=new JButton("Calculate");
  		  b1.setBounds(160, 280,150, 30);
  		  j.add(b1);
  		  j.setVisible(true);
  		  b1.addActionListener(this); 
       }
       public void actionPerformed(ActionEvent e)
       {
    	   if(e.getSource()==b1)
    	   {
    		   System.out.println(cb1.getSelectedItem());
    	       i=cb1.getSelectedIndex();
    	       if(i!=0)
    	       {
    	          p=p1[i];
    	          d=d1[i];
    	          System.out.println("Price:"+p+"Discount:"+d+"Final Price:"+(p-d));
    	          f[k]=(p-d);
    	          k++;
    	       }
    	       System.out.println(cb2.getSelectedItem());
    	       i=cb2.getSelectedIndex();
    	       if(i!=0)
    	       {
    	       	   p=p2[i];
    	           d=d2[i];
    	           System.out.println("Price:"+p+"Discount:"+d+"Final Price:"+(p-d));
    	           f[k]=(p-d);
    	           k++;
    	       }
    	       System.out.println(cb3.getSelectedItem());
    	       i=cb3.getSelectedIndex();
    	       if(i!=0)
    	       {
    	           p=p3[i];
    	           d=d3[i];
    	           System.out.println("Price:"+p+"Discount:"+d+"Final Price:"+(p-d));
    	           f[k]=(p-d);k++;
    	       }
    	   for(int m=0;m<k;m++)
    	   {
    		   sum+=f[m];
    	   }
    	   System.out.println("Bill Amout:"+sum);
    	   File d=new File("D:\\ramsai.txt");
			PrintStream p=null;
			try {
				p = new PrintStream(d);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

			
			p.println(cb1.getSelectedItem());
			p.println(cb2.getSelectedItem());
			p.println(cb3.getSelectedItem());
			p.println("Bill Amount : "+sum);
    	   }
    }
}