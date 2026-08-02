package Basics;

import java.util.Arrays;

public class PalindromNumber {
	public static void main(String[] args) {
		int []a= {10,11,121,1111,1234321};
		System.out.println(Arrays.toString(onlyPalindrome(a)));
	}
	
	public static int[] onlyPalindrome(int[]a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isPalindrome(arr))
			{
				count++;
			}
		}
		int [] newArray=new int[count];
		int index=0;
		
		for(int arr:a)
		{
			if(isPalindrome(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		
		for(int i=num;i>0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return num==rev;
	}
}
