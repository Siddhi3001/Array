package segregation;

public class VowelConsonant {
	
	 public static void main(String[] args) {

	        char[] ch = {'b', 'a', 'm', 'e', 'p', 'i', 'k', 'o'};

	        segregate(ch);

	        for (char c : ch) {
	            System.out.print(c + " ");
	        }
	    }

	    public static void segregate(char[] ch) {

	        int i = 0;
	        int j = ch.length - 1;

	        while (i < j) {

	            while (i < j && isVowel(ch[i])) {
	                i++;
	            }

	            while (i < j && !isVowel(ch[j])) {
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
	    
	    public static boolean isVowel(char ch) {

	    	   if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||
	    			   ch == 'U' ||
	    	            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
	    	            ch == 'u') {
	    	            return true;
	    	        }

	    	        return false;
	    }



}
