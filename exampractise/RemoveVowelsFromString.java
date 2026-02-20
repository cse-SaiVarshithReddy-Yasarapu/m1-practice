package exampractise;

public class RemoveVowelsFromString {

    public static String removeVowels(String s) {
    	String ans="";
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		char lower=Character.toLowerCase(ch);
    		
    		if(lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u' ) {
    			
    		}
    		else {
    			ans+=ch;
    		}
    	}
    	
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("Java Programming")); 
        System.out.println(removeVowels("HELLO world"));
        System.out.println(removeVowels("SaiVarshith"));
    }
}