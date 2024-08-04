package weekeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oneThreeSix 
{

	public static void main(String[] args) 
	{
		
		Scanner ini=new Scanner(System.in);
		int tc=ini.nextInt();
		while(tc-->0){
		int lent=ini.nextInt();
		String word=ini.next();
		ArrayList <Character> listO1=new ArrayList();
		ArrayList <Character> listO2=new ArrayList();
		for(int i=0;i<lent;i++){
		    if(i%2==0){
		        listO1.add(word.charAt(i));
		    }else{
		         listO2.add(word.charAt(i));
		        
		    }
		}
		    Collections.sort(listO1);
		    Collections.sort(listO2);
		    if(listO1.equals(listO2)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
	

	}
	}
}


