package MissingElement;

public class SmallestMissingPrimeNumber {
	public static void main(String[] args) {

        int[] a = {5, 6, 11, 8, 7, 20};

        printMissingSmallestPrime(a);
    }

    public static void printMissingSmallestPrime(int[] a) {

        int max = max(a);

        boolean[] isPresent = new boolean[max + 1];

        for (int i = 0; i < a.length; i++) {
            isPresent[a[i]] = true;
        }

        System.out.println("Missing Smallest Prime Numbers:");

        for (int i =1; i <= max; i++) {

            if (!isPresent[i]  && isPrime(i)) {
                System.out.print(i + " ");
                break;
            }
        }
    }


    public static boolean isPrime(int num)
	{
		if(num<=1)
			return false ;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	  public static int max(int[] a) {

	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < a.length; i++) {

	            if (a[i] > max) {
	                max = a[i];
	            }
	        }

	        return max;
	    }



}
