package Basics;

public class AverageOfEvenNumber {
	public static void main(String[] args) {
		int[]arr= {12,15,18,21,24,27};
		int sum=0;
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			sum+=arr[i];
			count++;
			}
		}
		double average =sum/count;
		System.out.println("The average of the Even element is : "+average);


	}

}
