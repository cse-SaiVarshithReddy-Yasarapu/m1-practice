package exampractise;

import java.util.Arrays;

public class EvaluateBasicExpressionString {

    public static int evaluate(String s) {
        int sign=1;
        int number=0;
        int ans=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(Character.isDigit(ch)) {
        		number=number*10+Character.getNumericValue(ch);
        	}
        	else if(ch=='+') {
        		ans+=number*sign;
        		number=0;
        		sign=1;
        	}
        	else {
        		ans+=number*sign;
        		number=0;
        		sign=-1;
        	}
        }
        ans+=number*sign;
        
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("100+20-5+3"));  // 28
        System.out.println(evaluate("100-50+25")); // 75
        System.out.println(evaluate("5+5+5"));     // 15
    }
}