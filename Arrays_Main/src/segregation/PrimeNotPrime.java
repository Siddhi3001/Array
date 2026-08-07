package segregation;

public class PrimeNotPrime {
	public static void main(String[] args) {

        int[] a = {10, 7, 4, 13, 8, 5, 9, 2, 15};

        segregate(a);

        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void segregate(int[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isPrime(a[i])) {
                i++;
            }

            while (i < j && !isPrime(a[j])) {
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

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
