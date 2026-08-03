package Basics;
import java.util.Arrays;
public class ArmStrongNumber {
	public static void main(String[] args) {
		int[] a= {123,153,370,112,345};
		System.out.println(Arrays.toString(onlyArmStrong(a)));
	}
	public static int[] onlyArmStrong(int[]a)
	{
		int count=0;
		for(int arr:a)
		{
			if(isArmStrong(arr))
			{
				count++;
				
			}
		}
		int[]newArray=new int[count];
		int index=0;
		
		for(int arr:a)
		{
			if(isArmStrong(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	
	public static boolean isArmStrong(int num)
	{
	    int sum = 0;
	    int count = 0;

	  
	    for (int i = num; i > 0; i /= 10)
	    {
	        count++;
	    }

	    for (int i = num; i > 0; i /= 10)
	    {
	        int ld = i % 10;
	        int pow = 1;

	        for (int a = 0; a < count; a++)
	        {
	            pow *= ld;
	        }

	        sum += pow;
	    }

	    return sum == num;
	}
	
}
