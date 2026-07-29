package Basics;

public class ProductOfElement {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			prod*=arr[i];
		}
		System.out.println("The Product is : "+prod);
	}


}
