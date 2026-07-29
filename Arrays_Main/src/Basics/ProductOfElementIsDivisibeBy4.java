package Basics;

public class ProductOfElementIsDivisibeBy4{
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			prod+=arr[i];
	    }
		System.out.println("Product of element is : "+prod);
		if(prod%4==0)
		{
			System.out.print("product Of Element is divisible by 4 ");
			
		}
		else
		{
			System.out.println("Product of Element Is not divisible by 4");
		}	
	}
}
