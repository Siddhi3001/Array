package Basics;
import java.util.Arrays;
public class StrongNumber {
	public static void main(String[] args) {
		int[]a= {1,4,2,145,321,245};
		System.out.println(Arrays.toString(onlyStrong(a)));
	}
	public static int[] onlyStrong(int[]a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isStrong(arr))
			{
				count++;
				
			}
		}
		int[]newArray=new int[count];
		int index=0;
		
		for(int arr:a)
		{
			if(isStrong(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	public static boolean isStrong(int num)
	{
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			int fact =1;
			while(last>1)
			{
				fact*=last;
				last--;
				
			}
			sum+=fact;
		}
		return sum==num;
	}

}
