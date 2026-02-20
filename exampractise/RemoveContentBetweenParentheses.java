package exampractise;

import java.util.Arrays;

public class RemoveContentBetweenParentheses {

    public static String removeContent(String input) {
       String[] arr=input.split("\\s+");
       System.out.println(Arrays.toString(arr));
       StringBuilder sb=new StringBuilder();
       int a=0;
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i].charAt(0)=='(') {
    		   continue;
    	   }
    	   if(a==0) {
    		   sb.append(arr[i]);
    		   sb.append(" ");
    	   }
    	   
       }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(removeContent("Java (is) very (powerful)"));
        System.out.println(removeContent("Hello (World)"));
        System.out.println(removeContent("Test (123) String"));
    }
}
