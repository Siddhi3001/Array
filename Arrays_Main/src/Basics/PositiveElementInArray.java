package Basics;

public class PositiveElementInArray {
public static void main(String[] args) {
		
		int arr[]= {-10,20,-30,40,50,-60};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}


}
