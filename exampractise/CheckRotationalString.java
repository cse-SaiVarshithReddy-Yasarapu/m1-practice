package exampractise;
import java.util.*;
public class CheckRotationalString {

    public static boolean isRotation(String s1, String s2) {
    	String ans=s1+s1;
    	if(ans.contains(s2)) {
    		return true;
    	}
    	
    	return false;
    }
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("hello", "lohel"));
        System.out.println(isRotation("java", "vjaa"));
    }
}
