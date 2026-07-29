package Basics;

public class TripleDigitNumber {
	public static void main(String[] args) {
		int[]arr= {5,12,7,145,99,3,456};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>=100 && arr[i]<1000)
			{
				System.out.print(arr[i] +" ");
			}
		}
	}

}
