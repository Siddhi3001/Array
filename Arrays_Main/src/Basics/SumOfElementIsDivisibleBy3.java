package Basics;

public class SumOfElementIsDivisibleBy3 {
	public static void main(String[] args) {
			int []arr= {10,20,30,40,50,60};
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
		    }
			
			if(sum%3==0)
			{
				System.out.print("Sum Of Element is divisible by 3 ");
				
			}
			else
			{
				System.out.println("Sum of Element Is not divisible by 3");
			}
			
	
			
	}

}
