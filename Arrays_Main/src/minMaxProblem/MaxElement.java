package minMaxProblem;

public class MaxElement {
	public static void main(String[] args) {
		int[]a= {12,4,22,12,43,34,1};
		System.out.println("The max element is : "+maxElement(a));
	}
	public static int maxElement(int[]a)
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
