package segregation;

public class UpperLower {

    public static void main(String[] args) {

        char[] ch = {'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H'};

        segregate(ch);

        for (char c : ch) {
            System.out.print(c + " ");
        }
    }

    public static void segregate(char[] ch) {

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {

            while (i < j && isUpper(ch[i])) {
                i++;
            }

            while (i < j && !isUpper(ch[j])) {
                j--;
            }

            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }
    }

    public static boolean isUpper(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }

        return false;
    }
}
