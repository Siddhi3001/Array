package Basics;

public class BuzzNumbersInArray {
	public static void main(String[] args) {
		int[]arr= {14,27,35,42,50,67,89};
		for(int i=0;i<arr.length;i++)
		{
			
			if (arr[i]%7==0 || arr[i]%10==7)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
}
