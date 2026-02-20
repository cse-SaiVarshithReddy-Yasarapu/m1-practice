package exampractise;

public class ToggleCaseAndReverseEntireString {

    public static String toggleAndReverse(String input) {
       StringBuilder ans=new StringBuilder();
       for(int i=input.length()-1;i>=0;i--) {
    	   char ch=input.charAt(i);
    	   if(Character.isUpperCase(ch)) {
    		   ans.append(Character.toLowerCase(ch));
    	   }
    	   else if(Character.isLowerCase(ch)) {
    		   ans.append(Character.toUpperCase(ch));
    	   }
    	   else {
    		   ans.append(ch);
    	   }
       }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleAndReverse("Java123"));
        System.out.println(toggleAndReverse("HelloWorld"));
        System.out.println(toggleAndReverse("SaiVarshith"));
    }
}