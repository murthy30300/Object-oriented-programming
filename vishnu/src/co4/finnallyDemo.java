package co4;

public class finnallyDemo 
{
	public static void main(String[] args) 
	{
		int [] a= {10,20,30,40};
		int [] b= {1,0,2,3};
		for(int i=0;i<5;i++) {
			try {
				for(int j=0;j<=5;j++) {
					try {
						System.out.print(a[i]%b[j]+" ");
					}
					catch(ArithmeticException e){
						System.out.print("Arithmetic Problem");
					}
				}
			}
			catch(ArrayIndexOutOfBoundsException s) {
				System.out.print("Array limit exceeded");
			}
			System.out.println();
		}

	}

}
