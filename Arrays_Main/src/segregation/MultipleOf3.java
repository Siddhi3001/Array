package segregation;

public class MultipleOf3 {
	public static void main(String[] args) {

        int[] a = {4, 9, 7, 12, 5, 18, 11, 6};

        segregate(a);

        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void segregate(int[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && a[i] % 3 == 0) {
                i++;
            }

            while (i < j && a[j] % 3 != 0) {
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

}
