package exampractise;

public class RemoveConsecutiveDuplicateCharacters {

    public static String removeConsecutive(String input) {
        StringBuilder sb=new StringBuilder();
        String ans="";
        int index=0;
        ans+=input.charAt(0);
        for(int i=1;i<input.length();i++) {
        	char ch=input.charAt(i);
        	if(!(ans.charAt(index)==ch)) {
        		ans+=ch;
        		index++;
        	}
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutive("aaabbccdaa")); 
        System.out.println(removeConsecutive("hellooo"));
        System.out.println(removeConsecutive("aabbcc"));
    }
}
