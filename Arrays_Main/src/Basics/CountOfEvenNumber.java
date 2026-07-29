package Basics;

public class CountOfEvenNumber {
	public static void main(String[] args) {
		int [] arr= {10,15,30,45,50};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) 
			{
				count++;
			}
		}
		System.out.println("The count of even element is : "+count);
	}


}
