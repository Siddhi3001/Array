package Basics;
import java.util.Arrays;
public class NeonNumber {
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(onlyNeonNumber(a)));
		
	}
	
	public static int[] onlyNeonNumber(int []a)
	{
		int count=0;
		for (int arr:a)
		{
			if (isNeonNumber(arr))
			{
				count++;
			}
		}
		
		int [] newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isNeonNumber(arr)) {
			newArray[index]=arr;
			index++;
		}
	}
	return newArray;
}
	public static boolean isNeonNumber(int num)
	{
		int sum=0;
		int sqr=num*num;
		while(sqr>0)
		{
			sum+=(sqr%10);
			sqr/=10;
		}
		return sum==num;
	}
	
	
	

}
