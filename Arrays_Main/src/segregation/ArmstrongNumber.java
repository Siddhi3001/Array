package segregation;

public class ArmstrongNumber {
	  public static void main(String[] args) {

		  int[] a = {153, 45, 370, 20, 371, 89};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isArmStrong(a[i])) {
	                i++;
	            }

	            while (i < j && !isArmStrong(a[j])) {
	                j--;
	            }

	            if (i < j) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;

	                i++;
	                j--;
	            }
	        }
	    }
	    public static boolean isArmStrong(int num)
		{
		    int sum = 0;
		    int count = 0;

		  
		    for (int i = num; i > 0; i /= 10)
		    {
		        count++;
		    }

		    for (int i = num; i > 0; i /= 10)
		    {
		        int ld = i % 10;
		        int pow = 1;

		        for (int a = 0; a < count; a++)
		        {
		            pow *= ld;
		        }

		        sum += pow;
		    }

		    return sum == num;
		}


}
