package Basics;

public class ProductOfArrayDivisibleBy3AND4 {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		
		int product=1;
		
		for(int i=0;i<arr.length;i++)
		{
			 if (arr[i] % 3 == 0 && arr[i] % 4 == 0) {

	          product*= arr[i];
			
			 }
		
		}
		System.out.println(product);
}

}
