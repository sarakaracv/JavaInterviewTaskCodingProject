package org.cydeo.coding;

public class Palindrome {
    public static void main(String[] args) {
        String name="sara";
        System.out.println(palindrome(name));
    }

    public static String palindrome(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)== sb.charAt(i)) {
             //   return true;
               return "palindrome";

            }
        }
        return "not palindrome";
        //return false;
    }
}
