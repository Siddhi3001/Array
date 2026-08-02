package Basics;

import java.util.Arrays;

public class HarshadNumber {
	
//	Example 1: 18 --> Sum of digits: --> 1 + 8 = 9  --> Check divisibility:
//	--> 18 ÷ 9 = 2 --> Since 18 is completely divisible by 9,
//		18 is a Harshad Number ✅

//	Example 2: 21 --> Sum of digits: --> 2+1=3 --> check divisibility : -->
//	21/3=7 -->Since 21 is completely divisible by 3,
//			18 is a Harshad Number ✅
	
	
	public static void main(String[] args) {
		
		int []a = {21,18,27,14,17,19,20};
		System.out.println(Arrays.toString(onlyHarshadNumber(a)));
		
	}
	
	public static int[] onlyHarshadNumber(int []a)
	{
		int count =0;
		for (int arr:a)
		{
			if(isHarshadNumber(arr)) 
			{
			count++;
			}
		}
		
		int index=0;
		int [] newArray=new int[count];
		for(int arr:a)
		{
			if(isHarshadNumber(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	
	}
	
	public static boolean isHarshadNumber(int num)
	{
		int sum=0;
		for (int i =num ;i>0;i/=10)
		{
			sum+=(i%10);
		}
		return num%sum==0;
	}

}
