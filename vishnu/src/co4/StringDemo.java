package co4;
public class StringDemo
{
	public static void main(String[] args) 
	{
			String s="apple banana orange grapes";
			String [] fruits=s.split(" ");
			int p=fruits.length;
			System.out.println(p);
			for(String fruit:fruits)
				System.out.println(fruit);
		
		/*
		 * equals()
		 * equalsIgnoreCase()
		 * CompareTo()
		 * toUpperCase()
		 * toLowerCase()
		 * split()
		 */
		
		
		int date=28;
		int month=3;
		int year=2023;
	    System.out.println(String.join("-", String.valueOf(date),String.valueOf(month),String.valueOf(year)));
		
		
		
		
		String name="KLU";
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('L'));
		System.out.println(name.lastIndexOf("U"));
		
		/*char [] fruit= {'a','p','p','l','e'};
		int [] num= {1,2,3,4,5};
		System.out.print(num);//hastValue
		System.out.print(fruit);
		*/
		
		char [] fruit= {'a','p','p','l','e'};
		StringBuilder sb=new StringBuilder();
		sb.append(fruit);
		System.out.println(sb);
		
		//String s=sb.toString();
		//System.out.println(s);
		sb.insert(0, "custard ");
		System.out.println(sb.toString());
		sb.setCharAt(5,'&');
		System.out.println(sb.toString());
		sb.delete(5, 9);
		System.out.println(sb.toString());
		sb.deleteCharAt(6);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		
		String source="able was i saw elba";
		StringBuilder sc=new StringBuilder(source);
		sc.reverse();
		if(source.equals(sc.toString()))
			System.out.println("palindrome");
		else
			System.out.println("NOT");
		
		String qualifiedName="D:\\list.txt";
		int end=qualifiedName.lastIndexOf("\\");
		int start=0;
		String path=qualifiedName.substring(start,end);
		System.out.println(path);
		String filename=qualifiedName.substring(end+1,qualifiedName.length());
		System.out.println(filename);
		System.out.println(filename.substring(filename.indexOf('.')+1,filename.length()));
		System.out.println(filename.substring(0,filename.indexOf('.')));
	}
}
