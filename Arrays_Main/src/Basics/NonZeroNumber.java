package Basics;

public class NonZeroNumber {
	public static void main(String[] args) {
		
		int [] arr= {0,10,0,20,0,30,40,0,50};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
