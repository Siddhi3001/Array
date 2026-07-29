package Basics;

public class MiddleIndex {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		
		if(arr.length%2!=0)
		{
			int middleIndex=arr.length/2;
			System.out.println("The middle element is : "+arr[middleIndex ] );
		}
		else {
			System.out.println("they Does'nt have middle elemnt ");
		}
			
	}
}
