package Basics;

public class Last3Character {
	public static void main(String[] args) {
		
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		for(int i=ch.length-1;i>=ch.length-3;i--)
		{
			System.out.print(ch[i]+ " ");
		}
	}

}
