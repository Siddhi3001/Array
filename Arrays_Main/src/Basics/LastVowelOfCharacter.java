package Basics;

public class LastVowelOfCharacter {
	public static void main(String[] args) {
		char[] ch = {'A', 'k', 'e', 'M', 'o', '#'};

		
		for(int i=ch.length-1;i>0;i--)
		{
			if(ch[i]=='A'|| ch[i]=='E'||ch[i]=='O'||ch[i]=='U'||ch[i]=='I'||
			ch[i]=='a'|| ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i')
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
