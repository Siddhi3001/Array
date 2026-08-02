package Basics;

import java.util.Arrays;

public class SunnyNumber {
	//8 + 1 = 9  --> 9 = 3 × 3
	//15 + 1 = 16 --> 16 = 4 × 4
	
	public static void main(String[] args) {
		int [] a= {12,8,3,15,17,19};
		System.out.println(Arrays.toString(onlySunny(a)));
	}
	
	public static int [] onlySunny(int[]a)
	{
		int count=0;
		for (int arr: a)
		{
			if(isSunny(arr))
			{
				count++;
			}
		}
		int [] newArray=new int[count];
		int index=0;
		
		for(int arr: a)
		{
			if (isSunny(arr))
			{
				newArray[index]=arr;
				index++;
						
			}
		}
		return newArray;
	}

	
	public static boolean isSunny(int num)
	{
		for (int i=1; i*i<=num+1;i++)
		{
			if(i*i==num+1)
			{
				return true;
			}

		}
		return false;
	}
	
	
}
