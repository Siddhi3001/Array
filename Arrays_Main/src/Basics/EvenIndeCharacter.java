package Basics;

public class EvenIndeCharacter {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		for (int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(ch[i] + " ");
			}
		}
	}

}
