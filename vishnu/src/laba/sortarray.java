package laba;

public class sortarray {

	public static void main(String[] args) {
		int [] arr=new int []{5, 2, 8, 7, 1};
		int temp=0,i,j;
		//displaying elements of original array
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//sorting the array in ascending order
		for( i=0;i<5;i++)
		{
		for( j=i+1;j<5;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[j];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		System.out.println("Elements of array in sorted in ascending order:");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
