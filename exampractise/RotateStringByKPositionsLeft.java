package exampractise;

public class RotateStringByKPositionsLeft {

    public static String rotateRight(String input, int k) {
    	if(k<0) {
    		return " ";
    	}
    	k=k%input.length();
        String ans=input.substring(k)+input.substring(0,k);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(rotateRight("abcdef", 2));
        System.out.println(rotateRight("java", 1));
        System.out.println(rotateRight("rotation", 3));
    }
}
