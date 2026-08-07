package segregation;

public class HappyNmber {
	public static void main(String[] args) {

		int[] a = {19, 20, 7, 12, 23, 4};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isHappy(a[i])) {
	                i++;
	            }

	            while (i < j && !isHappy(a[j])) {
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
	    
	    public static boolean isHappy(int num) {

	        while (num != 1 && num != 4) {

	            int sum = 0;

	            while (num > 0) {
	                int rem = num % 10;
	                sum += rem * rem;
	                num /= 10;
	            }

	            num = sum;
	        }

	        return num == 1;
	    }
}
