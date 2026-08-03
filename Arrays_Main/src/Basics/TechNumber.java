package Basics;
import java.util.Arrays;
public class TechNumber {
	public static void main(String[] args) {
		int a[]= {1023,2025,2345};
		System.out.println(Arrays.toString(onlyTech( a)));
	}
	
	public static int[] onlyTech(int[]a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isTech(arr))
			{
				count++;
			}
		}
		int []newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isTech(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isTech(int num)
	{
		int count =0;
		for (int i=num;i>0;i/=10)
		{
			count++;
		}
		if (count%2==0)
		{
			int pow=1;
			for(int i=0;i<count/2;i++)
			{
				pow*=10;
			}
				int last=num%pow;
				int first=num/pow;
				int sum=first+last;
				return sum*sum ==num;
			
		}
		return false;
	}

}
