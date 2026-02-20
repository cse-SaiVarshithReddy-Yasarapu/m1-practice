package exampractise;
import java.util.*;
public class FindFirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(!(map.containsKey(ch))) {
        		map.put(ch, 1);
        	}
        	else {
        		map.put(ch,map.get(ch)+1);
        	}
        }
        char ans=' ';
        for(Map.Entry<Character, Integer> map1 : map.entrySet()) {
        	if(map1.getValue()==1) {
        		ans=map1.getKey();
        		break;
        	}
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));      // w
        System.out.println(firstNonRepeating("aabbcc"));     // _
        System.out.println(firstNonRepeating("programming"));// p
    }
}
