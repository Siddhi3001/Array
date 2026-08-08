package minMaxProblem;

public class SecondMinimumElement {
	public static void main(String[] args) {
		int []a= {10,5,7,7,10,5,3};
		System.out.println("The Second Smallest Element is : "+secondMin(a));
		
	}
	public static int secondMin(int[]a)
	{
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i]!=min1)
			{
				min2=a[i];
			}
		}
		return min2;
	}

}
