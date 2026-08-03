package Basics;
import java.util.Arrays;
public class UglyNumber {
	public static void main(String[] args) {
		int [] a= {1,3,5,8,10,13,17,15,6};
		System.out.println(Arrays.toString(onlyUgly(a)));
	}
	
	public static int[] onlyUgly(int [] a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isUgly(arr))
			{
				count++;
			}
		}
		int [] newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isUgly(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isUgly(int num)
	{
		while(num>1)
		{
			if(num%2==0)
			{
				num/=2;
				
			}
			else if(num%3==0)
			{
				num/=3;
			}
			else if(num%5==0)
			{
				num/=5;
			}
			else
			{
				break;
			}
		}
		return num==1;
	}
}
