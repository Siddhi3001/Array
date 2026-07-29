package Basics;

public class ProductOfEvenNumber {
	
	public static void main(String[] args) {
		int [] arr= {10,15,20,25,30};
		int eprod=1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) 
			{
				eprod*=arr[i];
			}
		}
		System.out.println("The Product of even element is : "+eprod);
	}


}
