package Basics;

public class SumOfOddASCIIValue {
	public static void main(String[] args) {
		
		char[] ch = {'A', 'b', 'C', 'd', 'E'};
		
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i+0]%2!=0)
			{
				sum+=ch[i+0];
			}
		}
		System.out.println(sum);

	}
}
