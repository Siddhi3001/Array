package Basics;

public class LastDigitOfCharater {
	public static void main(String[] args) {
		char[] ch = {'A', '4', '#', '8', 'm', '2'};
		for(int i=ch.length-1;i>0;i--)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
