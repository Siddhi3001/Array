package Basics;

public class SumOfOddElement {
	public static void main(String[] args) {
		int [] arr= {11,20,33,40,55};
		int osum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 !=0) 
			{
				osum+=arr[i];
			}
		}
		System.out.println("The sum of odd element is : "+osum);
	}

}
