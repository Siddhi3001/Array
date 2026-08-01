package Basics;

public class LastLowerCaseCharacter {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'M', 'n', 'P', 'z'};
		for(int i=ch.length-1;i>0;i--)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
