package Basics;

import java.util.Scanner;
public class CharacterFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arrays Size : ");
		int size =sc.nextInt();
		char []arr=new char[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
			
		}
		for(char c:arr)
		{
			System.out.print(c + " ");
		}
		

	}

}
