package segregation;

public class NegativeNonNegative {
	public static void main(String[] args) {
	
	int[]a= {-1,2,-3,-4,5,-6,7,-8,-9,0};
	negativeNonNegative(a);
	
	for (int num : a) {
        System.out.print(num + " ");
	}
    }
	
	public static void negativeNonNegative(int []a) 
	{
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			while(i<j && a[i]<0)
			{
				i++;
				
			}
			while(i<j && a[j]>=0)
			{
				j--;
			}
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				
			}
		}

	}

}
