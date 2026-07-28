package Basics;

public class SumOfEvenElement {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		int esum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) 
			{
				esum+=arr[i];
			}
		}
		System.out.println("The sum of even element is : "+esum);
	}

}
