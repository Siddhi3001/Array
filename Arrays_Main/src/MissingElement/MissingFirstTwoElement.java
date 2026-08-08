package MissingElement;

public class MissingFirstTwoElement {
	public static void main(String[] args) {
		int []a= {5,6,6,11,8,7,20};
		missingFirstTwo(a);
	}
	public static void missingFirstTwo(int[]a)
	{
		int max=max(a);
		boolean []isPresent=new boolean[max+1];
		for(int i=0;i<a.length;i++)
		{
			isPresent[a[i]]=true;
		}
		System.out.println("Missing First Two element is array");
		int count=0;
		for(int i=0;i<max;i++)
		//for(int i=max-1;i>=0;i--)
		{
			if(!isPresent[i])
			{
				count++;
				System.out.print(i + " ");
				if(count==2)
				{
					break;
				}
			}
		}
		
	}
	public static int max(int []a)
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
