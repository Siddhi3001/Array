package Basics;

public class FirstVowleInArray {
	public static void main(String[] args) {
		char[] ch = {'#', 'T', 'm', 'E', '7', 'a'};
		
		for(int i=0;i<ch.length;i++)
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
