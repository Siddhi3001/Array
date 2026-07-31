package Basics;


public class UppercaseCharaterIndex {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		for (int i=0;i<ch.length;i++ )
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				System.out.print(i + " ");
			}
		}
	}

}
