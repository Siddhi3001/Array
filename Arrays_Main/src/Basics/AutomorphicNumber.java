package Basics;

import java.util.Arrays;

public class AutomorphicNumber {
	//An Automorphic Number is a number whose square ends with the same digits as the original number.
//Example 1: 5 --> 5 × 5 = 25 --> The square 25 ends with 5. -- >So, 5 is an
	//Automorphic Number ✅

//Example 2: 25 --> 25*25=625 -->  the square 625 ends with 25
	
	public static void main(String[] args) {
		int [] a= {2,5,25,14};
		System.out.println(Arrays.toString(onlyAutomorphicNumber(  a)));
	}
	public static int[] onlyAutomorphicNumber(int [] a)
	{
		int count =0;
		for(int arr:a)
		{
			if (isAutomorphicNumber(arr))
			{
				count++;
			}
		}
		int []newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isAutomorphicNumber(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isAutomorphicNumber(int num){
		int sqr=num*num;
		int temp=num;
		int pow=1;
		
		while(temp>0)
		{
			pow*=10;
			temp/=10;
		}
		int sqrlast=sqr%pow;
		
		
			return sqrlast==num;
	}

}
