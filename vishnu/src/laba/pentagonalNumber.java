package laba;

public class pentagonalNumber {

	public static void main(String[] args) {
		int add,c=0;
		 for(int i=0;i<100;i++)
		 {
			 add=(i*(3*i-1))/2;
			 System.out.print(add + " ");
			 c++;
			 if(c==10)
			 {
				 System.out.println();
				 c=0;
			 }
		 }
	}

}
