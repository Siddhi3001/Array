package MissingElement;

public class SmallestMisssingEvenNumber {

    public static void main(String[] args) {

        int[] a = {5, 6, 11, 8, 7, 20};

        printMissingSmallestEven(a);
    }

    public static void printMissingSmallestEven(int[] a) {

        int max = max(a);

        boolean[] isPresent = new boolean[max + 1];

        for (int i = 0; i < a.length; i++) {
            isPresent[a[i]] = true;
        }

        System.out.println("Missing Smallest Even Numbers:");

        for (int i =1; i <= max; i++) {

            if (!isPresent[i] && i%2==0) {
                System.out.print(i + " ");
                break;
            }
        }
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
