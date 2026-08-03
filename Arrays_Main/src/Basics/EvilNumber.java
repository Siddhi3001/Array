package Basics;
import java.util.Arrays;
public class EvilNumber {
//An Evil Number is a number whose binary representation contains
//an even number of 1s.
//Binary of 3:--> 3 → 11 --> Number of 1s:  -- > 2 → Even
	  
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(onlyEvil(a)));
	}
	public static int[] onlyEvil(int[]a)
	{
		int count =0;
		for (int arr: a)
		{
			if (isEvil(arr))
			{
				count++;
			}
		}
		int[]newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isEvil(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	
	public static boolean isEvil(int num)
	{
		int bin=0;
		int place=1;
		int ld=0;
		while(num>0)
		{
			ld=num%2;
			bin=bin+ld*place;
			num/=2;
			place*=10;
		}
		int count=0;
		while(bin>0)
		{
			int digit=bin%10;
			if(digit==1)
			{
				count++;
			}
			bin/=10;
		}
		return count%2==0;
	}
}
