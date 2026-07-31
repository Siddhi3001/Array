package Basics;

public class UpperCaseCharater {
	public static void main(String[] args) {
		
		char[]ch= {'A','b','e','#','I','m','o','P','u','7'};
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				System.out.print(ch[i] + " ");
			}
		}
	}

}
