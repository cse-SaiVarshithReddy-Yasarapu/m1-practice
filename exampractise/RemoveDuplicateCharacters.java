package exampractise;

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String input) {
       String ans="";
       for(int i=0;i<input.length();i++) {
    	   char ch=input.charAt(i);
    	   if(!(ans.contains(Character.toString(ch)))) {
    		   ans+=ch;
    	   }
       }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("1: " + removeDuplicates("programming"));   // progamin
        System.out.println("2: " + removeDuplicates("mississippi"));   // misp
        System.out.println("3: " + removeDuplicates("aabbcc"));        // abc
        System.out.println("4: " + removeDuplicates("abcdef"));        // abcdef
        System.out.println("5: " + removeDuplicates("aaaaaa"));        // a

        // Edge cases
        System.out.println("6: " + removeDuplicates(""));              // ""
        System.out.println("7: " + removeDuplicates("a"));             // a
        System.out.println("8: " + removeDuplicates(" "));             // " "
        System.out.println("9: " + removeDuplicates("   "));           // " "
        System.out.println("10: " + removeDuplicates("a b a b"));      // "a b"

        // Case sensitivity
        System.out.println("11: " + removeDuplicates("AaBbAa"));       // AaBb

        // Numbers
        System.out.println("12: " + removeDuplicates("112233"));       // 123

        // Special characters
        System.out.println("13: " + removeDuplicates("a!b@a!c"));      // a!b@c

        // Mixed input
        System.out.println("14: " + removeDuplicates("Java123Java"));  // Jav123

        // Unicode characters
        System.out.println("15: " + removeDuplicates("ääbbää"));       // äb

        // Null test (will throw exception unless you handle null)
        // System.out.println("16: " + removeDuplicates(null));
    }
}