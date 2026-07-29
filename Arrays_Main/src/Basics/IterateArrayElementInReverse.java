package Basics;

public class IterateArrayElementInReverse {
	
	public static void main(String[] args) {
		
		int[]arr= {10,20,30,40,50};
		int rev=0;
		for(int i=0;i<arr.length;i/=10)
		{
			int ld=arr[i]%10;
			rev=rev*10+ld;
		}
		System.out.println(rev);
		
	}

}
