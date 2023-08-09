package org.cydeo.string_tasks;

public class String_Reverse {

    public static void main(String[] args) {
        String nb="abcd";
        System.out.println(reverse(nb));
    }

    public static String reverse(String str) {

        StringBuffer bf= new StringBuffer();

        for(int i=str.length()-1; i >= 0; i--) {
            Character ch= str.charAt(i);
            bf.append(ch);
        }
        return bf.toString();

    }


}
