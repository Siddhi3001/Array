package Basics;

public class ASCIISumOfCharater {
	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			sum+=ch[i+0];
		}
		System.out.println(sum);
	}

}
