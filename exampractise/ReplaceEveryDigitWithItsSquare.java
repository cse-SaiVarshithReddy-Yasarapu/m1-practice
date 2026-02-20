package exampractise;

public class ReplaceEveryDigitWithItsSquare {

    public static String replaceDigitWithSquare(String input) {
        String ans="";
        for(int i=0;i<input.length();i++) {
        	char ch=input.charAt(i);
        	if(Character.isDigit(ch)) {
        		int a=Character.getNumericValue(ch);
        		 a=a*a;
        		ans+=a;
        	}
        	else {
        		ans+=ch;
        	}
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(replaceDigitWithSquare("a3b4"));
        System.out.println(replaceDigitWithSquare("Java2026"));
        System.out.println(replaceDigitWithSquare("abc"));
    }
}
