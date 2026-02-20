package exampractise;
import java.util.*;
public class FindSecondMostFrequentCharacter {

    public static char secondMostFrequent(String input) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        if(input==null) {
        	return '-';
        }
        if(input.length()==0) {
        	return '-';
        }
        
        for(int i=0;i<input.length();i++) {
        	char ch=input.charAt(i);
        	if(!(map.containsKey(ch))) {
        		map.put(ch,1);
        	}
        	else {
        		map.put(ch,map.get(ch)+1);
        	}
        }
        int max=0;
        int sec=0;
        for(Map.Entry<Character, Integer> map1 : map.entrySet()) {
        	if(map1.getValue()>max) {
        		sec=max;
        		max=map1.getValue();
        	}
        	else if(map1.getValue()>sec && map1.getValue()<max) {
        		sec=map1.getValue();
        	}
        }
        for(Map.Entry<Character, Integer> map1 : map.entrySet()) {
        	if(map1.getValue()==sec) {
        		return map1.getKey();
        	}
        	
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(secondMostFrequent("aabbbcc")); 
        System.out.println(secondMostFrequent("aaaa"));
        System.out.println(secondMostFrequent("programming"));
    }
}
