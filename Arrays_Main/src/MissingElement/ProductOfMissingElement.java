package MissingElement;

public class ProductOfMissingElement {
	public static void main(String[] args) {
		
		int []a= {5,6,6,11,8};
		System.out.println("Sum of Missing ELement in Array is ");
		productOfMissing(a);
		
	}
	public static void productOfMissing(int[]a)
	{
		int max=max(a);
		boolean [] isPresent=new boolean[max+1];
		for(int i=0;i<a.length;i++)
		{
			isPresent[a[i]]=true;
		}
		int prod=1;
		for(int i=1;i<max;i++)
		{
			if(!isPresent[i])
			{
				prod*=i;
			}
		}
		System.out.println(prod);
		
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
