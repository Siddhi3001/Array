package minMaxProblem;

public class ThirdSmallestElement {
	public static void main(String[] args) {
		int[]a= {5,3,4,2,1,1,2};
		System.out.println("Smallest Third Element is : "+thirdSmallElement(a));
	}
	public static int thirdSmallElement(int[]a)
	{
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int min3=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min3=min2;
				min2=min1;
				min1=a[i];
				
			}
			else if(a[i]<min2 && a[i]!=min1) 
			{
				min3=min2;
				min2=a[i];
			}
			else if(a[i]<min3 && a[i]!=min2 && a[i]!=min1)
			{
				min3=a[i];
			}
		}
		return min3;
	}
	

}
