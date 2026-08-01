package Basics;

public class FirstConsonentInArray {
	public static void main(String[] args) {
		
		char[] ch = {'@', '3', 'A', 'k', 'e', 'M'};
		for(int i=0;i<ch.length;i++)
		{
			if ((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z'))
				
			{
				if(ch[i]!='A'&&ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && 
				  ch[i]!='U'&& ch[i]!='a' && ch[i]!='e' && ch[i]!='i' &&
				  ch[i]!='o' && ch[i]!='u')
				{
				System.out.print(ch[i] + " ");
				break;
				}
			}
	}

	}
	}
