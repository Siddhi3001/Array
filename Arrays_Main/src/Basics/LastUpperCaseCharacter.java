package Basics;

public class LastUpperCaseCharacter {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'M', '7', 'P', 'e'};
		for(int i=ch.length-1;i>0;i--)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				System.out.println(ch[i]);
				break;
			}
		}

	}

}
