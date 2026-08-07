package segregation;

public class AlphabetDigit {
	 public static void main(String[] args) {

	        char[] ch = {'A', '5', 'b', '7', 'C', '2', 'd', '9'};

	        segregate(ch);

	        for (char c : ch) {
	            System.out.print(c + " ");
	        }
	    }

	    public static void segregate(char[] ch) {

	        int i = 0;
	        int j = ch.length - 1;

	        while (i < j) {

	            while (i < j && isAlphabet(ch[i])) {
	                i++;
	            }

	            while (i < j && !isAlphabet(ch[j])) {
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

	    public static boolean isAlphabet(char ch) {

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            return true;
	        }

	        return false;
	    }
	

}
