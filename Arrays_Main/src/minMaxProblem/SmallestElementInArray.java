package minMaxProblem;

import java.util.Arrays;

public class SmallestElementInArray {
	public static void main(String[] args) {
		int[]a= {10,20,5,4,2,3};
		System.out.println(Arrays.toString(a));
		
		System.out.println("Smallest Element from array is :"+
		smallestElement(a));
		
	}
	public static int smallestElement(int[]a)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}

}
