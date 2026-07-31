package Basics;

public class PrintDigit {
	public static void main(String[] args) {
		char[]ch=  {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'};
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				System.out.println(ch[i]+" ");
			}
		}

	}
}
