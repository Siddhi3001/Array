package Basics;

public class FirstDigitInCharacter {
	public static void main(String[] args) {
		char[] ch = {'A', '#', 'm', '5', '9'};
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]>='0'&&ch[i]<='9') {
				System.out.println(ch[i]);
				break;
			}
		}

	}

}
