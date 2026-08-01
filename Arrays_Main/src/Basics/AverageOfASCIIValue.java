package Basics;

public class AverageOfASCIIValue {
	public static void main(String[] args) {
		char[] ch = {'M', 'N', 'O'};
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			sum+=ch[i+0];
		}
		int avg=sum/ch.length;
		System.out.println(avg);
				
	}

}
