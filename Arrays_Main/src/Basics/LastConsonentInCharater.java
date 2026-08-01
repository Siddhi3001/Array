package Basics;

public class LastConsonentInCharater {
	public static void main(String[] args) {
		char[] ch = {'A', 'k', 'e', 'M', 'o', 't'};
		for (int i=ch.length-1;i>0;i--)
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
