package exampractise;

public class CountUppercaseLowercaseDigitsSpecialCharacters {

    public static String countCharacters(String input) {
       int countUpper=0;
       int countLower=0;
       int countDigits=0;
       int countSpecial=0;
       
       for(int i=0;i<input.length();i++) {
    	   char ch=input.charAt(i);
    	   if(Character.isUpperCase(ch)) {
    		   countUpper++;
    	   }
    	   else if(Character.isLowerCase(ch)) {
    		   countLower++;
    	   }
    	   else if(Character.isDigit(ch)) {
    		   countDigits++;
    	   }
    	   else {
    		   countSpecial++;
    	   }
       }
        return "Upper: "+countUpper+" Lower: "+countLower+" Digits: "+countDigits+" Special: "+countSpecial;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters("Java123!@"));
        System.out.println(countCharacters("HelloWorld2026"));
        System.out.println(countCharacters("Test@1234#"));
    }
}