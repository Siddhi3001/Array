package MissingElement;

public class SumAndCountOfOddMissingElement {
	public static void main(String[] args) {
		int []a= {5,6,6,11,8};
		printMissing(a);
		
	}
	public static void printMissing(int[]a)
	{
		int max =max(a);
		boolean[]isPresent=new boolean[max+1];
		for(int i=0;i<a.length;i++)
		{
			isPresent[a[i]]=true;
		}
		int sum =0;
		int count=0;
		for(int i=0;i<=max;i++)
		{
			if(!isPresent[i])
			{
				if(i%2!=0) {
				count++;
				sum+=i;
				}
				
			}
		}
		System.out.println("Sum of missing even element is : "+sum);
		System.out.println("Count of missing even Element is: "+count);
	}
	
	public static int max(int[]a)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	


}
