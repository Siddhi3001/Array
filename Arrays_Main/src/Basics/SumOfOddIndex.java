package Basics;

public class SumOfOddIndex {
	 	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0)
			{
				sum+=a[i];
			}
		}
		System.out.println("The Sum Element of Odd index is : "+sum);
	}

	}


