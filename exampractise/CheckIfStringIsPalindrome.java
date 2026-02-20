package exampractise;

public class CheckIfStringIsPalindrome {

    public static boolean isValidPalindrome(String input) {
        // Ignore specialcharacters digits ;
    	
    	if(input==null) {
    		return false;
    	}
    	if(input.length()==0) {
    		return false;
    	}
    	
    	String s1="";
    	for(int i=0;i<input.length();i++){
    		char ch=input.charAt(i);
    		if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
    			s1+=Character.toLowerCase(ch);
    		}
    	}
    	StringBuilder sb=new StringBuilder(s1);
    	if(s1.equals(sb.reverse().toString())){
    		return true;
    	}
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidPalindrome("race a car"));
        System.out.println(isValidPalindrome("Madam"));
    }
}
