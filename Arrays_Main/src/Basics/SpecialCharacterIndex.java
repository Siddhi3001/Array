package Basics;

public class SpecialCharacterIndex {
	public static void main(String[] args) {
		
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		for(int i=0;i<ch.length;i++)
		{
			if(!((ch[i]>='A'&& ch[i]<='Z')||(ch[i]>='a'&& ch[i]<='z')
				||(ch[i]>='0'&& ch[i]<='9')))
			{
				System.out.print(i+ " ");
			}
		}
	}

}
