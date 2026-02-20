package exampractise;

public class ReverseWordsOrderTrimExtraSpaces {

    public static String reverseWords(String s) {
       s=s.strip();
       String[] arr=s.split("\\s+");
       StringBuilder sb=new StringBuilder();
       for(int i=arr.length-1;i>=0;i--) {
    	   sb.append(arr[i]);
    	   sb.append(" ");
       }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   Java   is   powerful  "));
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("a good   example"));
    }
}