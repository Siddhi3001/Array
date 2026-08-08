package MissingElement;

public class MissingElementBetweenMinAndMax {
	public static void main(String[] args) {

        int[] a = {5, 6, 6, 11, 8, 7, 20};

        printMissing(a);
    }

    public static void printMissing(int[] a) {

        int min = min(a);
        int max = max(a);

        boolean[] isPresent = new boolean[max + 1];

        for (int i = 0; i < a.length; i++) {
            isPresent[a[i]] = true;
        }

        System.out.println("Missing elements between minimum and maximum:");

        for (int i = min; i <= max; i++) {

            if (!isPresent[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static int min(int[] a) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;
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
