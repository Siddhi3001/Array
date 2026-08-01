package Basics;

public class ProductOfOddASCIIValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'A', 'C', 'E'};
		int product=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i+0]%2!=0) 
			{
			product*=ch[i+0];
			}
		}
		System.out.println(product);

		

	}


}
