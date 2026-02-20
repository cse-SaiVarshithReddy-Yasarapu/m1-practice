package exampractise;
import java.util.*;
public class CompressString {

    public static String compressString(String input) {
    	if(input==null || input.length()==0) {
    		return input;
    	}
    	StringBuilder sb=new StringBuilder("");
    	int count=1;
    	for(int i=1;i<input.length();i++) {
    		if(input.charAt(i)==input.charAt(i-1)) {
    			count++;
    		}
    		else {
    			sb.append(input.charAt(i-1));
    			sb.append(count);
    			count=1;
    		}
    	}
    	sb.append(input.charAt(input.length()-1)).append(count);
    	if(sb.length()>=input.length()) {
    		return input;
    	}
    	
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbcc"));
        System.out.println(compressString("abcd"));
        System.out.println(compressString("aabbccaaa"));
        System.out.println(compressString(""));
    }
}
