package Basics;

public class LowerCaseCharaterIndex {

	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		for (int i=0;i<ch.length;i++ )
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				System.out.print(i + " ");
			}
		}
	}
}
