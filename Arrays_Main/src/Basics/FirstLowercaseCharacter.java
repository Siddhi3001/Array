
package Basics;

public class FirstLowercaseCharacter {
	public static void main(String[] args) {
		char[] ch = {'@', 'A', '7', 'n', 'B'};

		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]>='a'&&ch[i]<='z') {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
