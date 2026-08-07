package segregation;

public class Seg0sAnd1s {
	public static void main(String[] args) {
		
		int[]a= {1,0,1,1,0,0,1,0,1};
		seg(a);
		for(int arr : a)
		{
			System.out.print(arr+" ");
		}
	}
	public static void seg(int []a)
	{
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			while(i<j && a[i]==1)
			{
				i++;
				
			}
			while(i<j && a[j]==0)
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
