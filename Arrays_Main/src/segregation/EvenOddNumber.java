package segregation;

public class EvenOddNumber {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,0};
		EvenOdd(a);
		
		for (int num : a) {
            System.out.print(num + " ");
        }
		
	}
	public static void EvenOdd(int[]a)
	{
		int i=0,j=a.length-1;
		while(i<j)
		{
			while(i<j && a[i]%2==0)
			{
				i++;
			}
			while(i<j && a[j]%2!=0)
			{
				j--;
			}
			if(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		}
	}

}
