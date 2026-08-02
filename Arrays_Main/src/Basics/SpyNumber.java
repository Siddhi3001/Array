package Basics;
import java.util.Arrays;
public class SpyNumber {
	public static void main(String[] args) {
		int[] a= {22,10,5,123,12,17,19};
		System.out.println(Arrays.toString(onlySpy(a)));
		
	}

public static int[] onlySpy(int [] a)
{
	int count=0;
	for(int arr:a)
	{
		if (isSpy(arr)) 
		{
			count++;
		}
	}
	
	int[] newArray=new int[count];
	int index=0;
	for(int arr:a)
	{
		if(isSpy(arr))
		{
			newArray[index]=arr;
			index++;
		}
		
	}
	return newArray;
}

public static boolean isSpy(int num)
{
	int prod=1;
	int sum=0;
	
	for(int i=num;i>0;i/=10)
	{
		sum +=(i%10);
		prod *=(i%10);
	}
	return sum==prod;
}
}
