package Basics;
import java.util.Arrays;
public class PerfectNumber {
	public static void main(String[] args) {
		int[]a= {5,6,12,32,28};
		System.out.println(Arrays.toString(onlyPerfect(a)));
	}
	public static int[] onlyPerfect(int[]a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isPerfect(arr))
			{
				count++;
				
			}
		}
		int[]newArray=new int[count];
		int index=0;
		
		for(int arr:a)
		{
			if(isPerfect(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isPerfect(int num)
	{
		int den=1;
		int sum=0;
		while(den<=num/2)
		{
			if(num%den==0)
			{
				sum+=den;
			}
			den++;
		}
		return sum==num;
		
	}

}
