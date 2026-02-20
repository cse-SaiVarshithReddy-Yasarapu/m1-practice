package exampractise;

public class RemoveFirstandLastCharacterofEachWord {

    public static String removeEdges(String input) {
        String[] arr=input.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].length()<=2) {
        		continue;
        	}
        	else {
        		String a=arr[i].substring(1,arr[i].length()-1);
        		sb.append(a);
        		sb.append(" ");
        	}
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(removeEdges("Java is powerful"));
        System.out.println(removeEdges("Hello world"));
        System.out.println(removeEdges("I love Java"));
    }
}