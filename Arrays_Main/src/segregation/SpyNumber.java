package segregation;

public class SpyNumber {
	public static void main(String[] args) {

		int[] a = {1124, 123, 1412, 22, 132};

	        segregate(a);

	        for (int arr : a) {
	            System.out.print(arr + " ");
	        }
	    }

	    public static void segregate(int[]a) {

	        int i = 0;
	        int j = a.length - 1;

	        while (i < j) {

	            while (i < j && isSpy(a[i])) {
	                i++;
	            }

	            while (i < j && !isSpy(a[j])) {
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

	    public static boolean isSpy(int num)
	    {
	    	int prod=1;
	    	int sum=0;
	
	    	for(int i=num;i>0;i/=10)
	    	{
	    		sum +=(i%10);
	    		prod *=(i%10);
	    	}
	    	return sum==prod;
	    }


}
