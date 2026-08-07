package Basics;

public class NumberWithiEvenNumberOfDigit {
	
	public static void main(String[] args) {
		int[]nums = {12,345,2,6,7896};
		System.out.println(EvenCount(nums));
		
	}
	public static int EvenCount(int []nums)
	{
		int count =0;
		for (int i=0;i<nums.length;i++)
		{
			if(Count(nums[i]))
			{
				count++;
				
			}
		}
		return count;
	}
	
	
	
	private static boolean Count(int num)
	{
		int count =0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count%2==0;
	}

}
