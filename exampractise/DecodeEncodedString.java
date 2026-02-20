package exampractise;
import java.util.*;
public class DecodeEncodedString {

    public static String decode(String s) {
        
    	Stack<Integer> st1=new Stack<>();
    	Stack<Character> st2=new Stack<>();
    	
    	StringBuilder sb=new StringBuilder();
    	int number=0;
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(ch>='1' && ch<='9') {
    			
    		}
    	}
    	
        return "";
    }

    public static void main(String[] args) {
        System.out.println(decode("3[a]2[bc]"));      // aaabcbc
        System.out.println(decode("2[ab3[c]]"));     // abcccabccc
        System.out.println(decode("3[a2[c]]"));      // accaccacc
    }
}