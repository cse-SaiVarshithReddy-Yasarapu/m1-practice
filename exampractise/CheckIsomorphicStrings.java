package exampractise;

import java.util.LinkedHashMap;

public class CheckIsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
    	if(s.length()!=t.length()) {
    		return false;
    	}
       LinkedHashMap<Character,Character> map1=new LinkedHashMap<>();
       LinkedHashMap<Character,Character> map2=new LinkedHashMap<>();
       
       for(int i=0;i<t.length();i++) {
    	   char ch1=s.charAt(i);
    	   char ch2=t.charAt(i);
    	   
    	   if(!(map1.containsKey(ch1))) {
    		   map1.put(ch1,ch2);
    	   }
    	   else {
    		   if(map1.get(ch1)!=ch2) {
    			   return false;
    		   }
    	   }
    	   
    	   if (map2.containsKey(ch2)) {
               if (map2.get(ch2) != ch1) {
                   return false;
               }
           } else {
               map2.put(ch2, ch1);
           }
       }
       
       
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));  // true
        System.out.println(isIsomorphic("foo", "bar"));  // false
        System.out.println(isIsomorphic("paper", "titlee")); // true
    }
}
