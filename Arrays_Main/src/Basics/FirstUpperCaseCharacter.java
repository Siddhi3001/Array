package Basics;

public class FirstUpperCaseCharacter {
	public static void main(String[] args) {
		char[] ch = {'#', '7', 'm', 'P', 'a'};
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]>='A'&&ch[i]<='Z') {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
