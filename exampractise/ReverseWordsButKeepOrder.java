package exampractise;

import java.util.Arrays;

public class ReverseWordsButKeepOrder {

    public static String reverseEachWord(String input) {
       String[] arr=input.split(" ");
       StringBuilder sb;
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<arr.length;i++) {
    	   sb=new StringBuilder(arr[i]);
    	  
    	   ans.append(sb.reverse());
    	   ans.append(" ");
       }
       
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java is powerful"));
        System.out.println(reverseEachWord("Hello World"));
        System.out.println(reverseEachWord("OpenAI creates AI"));
    }
}
