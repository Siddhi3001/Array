package Basics;

public class SumOfLast3Element {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int sum=0;
		for(int i=arr.length-1;i>=arr.length-3;i--)
		{
			sum+=arr[i];
		}
		System.out.println("The Sum Of Last 3 Element is : "+sum);
		
	}

}
