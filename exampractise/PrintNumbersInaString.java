package exampractise;

import java.util.Arrays;

public class PrintNumbersInaString {
	static public void returnString() {
		String s="Hi123 yo 25";
		String a="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				a+=ch;
				
			}
			else {
				a+=" ";
			}
		}
		a=a.strip();
		String[] arr=a.split("\\s+");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	returnString();
}
}
