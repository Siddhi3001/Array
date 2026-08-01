package Basics;

public class ProductOfASCIIValue {
	public static void main(String[] args) {
		char[] ch = {'A', 'B', 'C'};
		int product=1;
		for(int i=0;i<ch.length;i++)
		{
			product*=ch[i+0];
		}
		System.out.println(product);

	}

}
