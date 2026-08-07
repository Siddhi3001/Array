package segregation;

public class Duck {
	public static void main(String[] args) {

		int[] a = {1203, 456, 102, 98, 305};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isDuck(a[i])) {
	                i++;
	            }

	            while (i < j && !isDuck(a[j])) {
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
	    public static boolean isDuck(int num) {

	        if (num == 0)
	            return false;

	        while (num > 0) {

	            if (num % 10 == 0)
	                return true;

	            num /= 10;
	        }

	        return false;
	    }

}
