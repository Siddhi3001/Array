package MissingElement;

public class OddMissingElement {
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
		System.out.println("Even missing element is :");
		for(int i=0;i<=max;i++)
		{
			if(!isPresent[i])
			{
				if(i%2!=0) {
				System.out.print(i + " ");
				}
				
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
