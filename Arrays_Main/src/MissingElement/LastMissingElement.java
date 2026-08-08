package MissingElement;

public class LastMissingElement {
	public static void main(String[] args)
	{	
		int []a= {5,6,6,11,8,7,20};
		printLastMissEle(a);
	}
	public static void printLastMissEle(int[]arr)
	{
		int max=max(arr);
		boolean []isPresent=new boolean[max+1];
		for(int i=0;i<arr.length;i++)
		{
			isPresent[arr[i]]=true;
		}
		System.out.println("Last Missing Element : ");
		for(int i=max-1;i>=0;i--)
		{
			if(!isPresent[i])
			{
				System.out.println(i);
				break;
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
