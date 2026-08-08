package segregation;

public class PalindromeNumebr {
	  public static void main(String[] args) {

	        char[] ch = {'A', '#', 'b', '@', 'C', '%', 'd', '&'};

	        segregate(ch);

	        for (char c : ch) {
	            System.out.print(c + " ");
	        }
	    }

	    public static void segregate(char[] ch) {

	        int i = 0;
	        int j = ch.length - 1;

	        while (i < j) {

	            while (i < j ) {
	                i++;
	            }

	            while (i < j ) {
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

}
