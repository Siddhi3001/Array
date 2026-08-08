package MissingElement;

public class AllMissingElement {
	public static void main(String[] args)
	{	
		int []a= {5,6,6,11,8,7,20};
		printAllMissEle(a);
	}
	public static void printAllMissEle(int[]arr)
	{
		int max=max(arr);
		boolean []isPresent=new boolean[max+1];
		for(int i=0;i<arr.length;i++)
		{
			isPresent[arr[i]]=true;
		}
		for(int i=1;i<isPresent.length;i++)
		{
			if(!isPresent[i])
			{
				System.out.println(i);
			}
		}
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
