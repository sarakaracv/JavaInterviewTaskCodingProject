package org.cydeo.coding;

public class ReverseString {
    public static void main(String[] args) {
        String st= "sara";
        System.out.println(reverse(st));
    }
    public static String reverse(String str){
        StringBuilder sb= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
