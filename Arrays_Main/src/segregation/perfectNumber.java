package segregation;

public class perfectNumber {
	public static void main(String[] args) {

		int[] a = {6, 15, 28, 20, 496, 18};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isPerfect(a[i])) {
	                i++;
	            }

	            while (i < j && !isPerfect(a[j])) {
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
	    public static boolean isPerfect(int num)
		{
			int den=1;
			int sum=0;
			while(den<=num/2)
			{
				if(num%den==0)
				{
					sum+=den;
				}
				den++;
			}
			return sum==num;
			
		}


	    

}
