package Basics;
import java.util.Arrays;
public class PrimeNumber {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(onlyPrime(a)));
	}
	public static int[] onlyPrime(int []a)
	{
		int count =0;
		for(int arr : a)
		{
			if(isPrime(arr))
			{
				count++;
			}
		}
		int [] newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isPrime(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false ;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
