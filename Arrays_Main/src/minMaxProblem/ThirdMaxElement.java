package minMaxProblem;

public class ThirdMaxElement {

	public static void main(String[] args) {
		int[]a= {123,12,133,123,123,14,125};
		System.out.println("Third Max Element is : "+thirdElement(a));
	}
	public static int thirdElement(int[]a)
	{
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
			{
				max3=max2;
				max2=a[i];
			}
			else if(a[i]>max3 && a[i]!=max1 && a[i]!=max2)
			{
				max3=a[i];
			}
		}
		
		return max3;
		
	}

}
