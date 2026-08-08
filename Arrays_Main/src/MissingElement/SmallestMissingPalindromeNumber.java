package MissingElement;

public class SmallestMissingPalindromeNumber {
	public static void main(String[] args) {

        int[] a = {5, 6, 11, 8, 7, 20};

        printMissingSmallestPalindrome(a);
    }

    public static void printMissingSmallestPalindrome(int[] a) {

        int max = max(a);

        boolean[] isPresent = new boolean[max + 1];

        for (int i = 0; i < a.length; i++) {
            isPresent[a[i]] = true;
        }

        System.out.println("Missing Smallest Palindrome Numbers:");

        for (int i =1; i <= max; i++) {

            if (!isPresent[i]  && isPalindrome(i)) {
                System.out.print(i + " ");
                break;
            }
        }
    }
    public static int max(int[]a)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		return max;
	}
    public static boolean isPalindrome(int num) {

        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == num;
    }


}
