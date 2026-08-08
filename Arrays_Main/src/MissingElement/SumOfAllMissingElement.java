package MissingElement;

public class SumOfAllMissingElement {
	public static void main(String[] args) {
		int []a= {5,6,6,11,8};
		System.out.println("Sum of Missing ELement in Array is ");
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
		for(int i=0;i<=max;i++)
		{
			if(!isPresent[i])
			{
				sum+=i;
				
			}
		}
		System.out.println(sum);
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
