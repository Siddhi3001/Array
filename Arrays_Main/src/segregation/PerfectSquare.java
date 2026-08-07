package segregation;

public class PerfectSquare {
	public static void main(String[] args) {

		int[] a = {10, 16, 7, 25, 18, 36, 20};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isPerfectSquare(a[i])) {
	                i++;
	            }

	            while (i < j && !isPerfectSquare(a[j])) {
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
