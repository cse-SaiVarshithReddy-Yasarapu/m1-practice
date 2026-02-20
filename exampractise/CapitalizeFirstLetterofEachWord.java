package exampractise;

public class CapitalizeFirstLetterofEachWord {

    public static String capitalize(String input) {
        String[] arr=input.split("[\\s+]");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
        	sb.append(Character.toUpperCase(arr[i].charAt(0)));
        	
        	sb.append(arr[i].substring(1).toLowerCase());
        	sb.append(" ");
        }
        return sb.toString().strip();
    }

    public static void main(String[] args) {
        System.out.println(capitalize("java is powerful"));
        System.out.println(capitalize("hello world"));
        System.out.println(capitalize("sai varshith"));
    }
}