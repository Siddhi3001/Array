package Basics;
import java.util.Arrays;
public class PerfectSquareNumber {
	
	public static void main(String[] args) {
		
		// 1 = 1 × 1 = 1²
		// 4 = 2 × 2 = 2²
		// 9 = 3 × 3 = 3²
		// 16 = 4 × 4 = 4²
		// 25 = 5 × 5 = 5²
		// 36 = 6 × 6 = 6²
		
		int[]a= {1,2,3,4,16,23,25,12,36};
		System.out.println(Arrays.toString(onlyPerfectSquare(a)));
		
	}
	public static int[] onlyPerfectSquare(int[]a)
	{
		int count=0;
		for (int arr:a)
		{
			if (isPerfectSquare(arr))
			{
				count++;
			}
		}
		int []newArray=new int[count];
		int index=0;
		for(int arr:a)
		{
			if(isPerfectSquare(arr))
			{
				newArray[index]=arr;
				index++;
			}
		}
		return newArray;
	}
	
	public static boolean isPerfectSquare(int num) {

        for (int i = 1; i * i <= num; i++) 
        {
            if (i * i == num) 
            {
                return true;
            }
        }

        return false;
    }

}
