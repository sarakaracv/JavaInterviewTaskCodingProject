package org.cydeo.string_tasks;

import java.util.Scanner;

public class String_PalindromeSubString {
    public static void main(String[] args) {
        String palindrome="saras";
        //System.out.println(palindrome(palindrome));
        Scanner sc= new Scanner(System.in);
        String pal=sc.nextLine();
        System.out.println(palindrome(pal));
    }

    public static String PalindromeSubstring(String str) {

        String result = "";
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            int j = i, l = i;
            while (--j >= 0 && ++l <= str.length() - 1) {
                if (isPalindrome(str.substring(j, l))) {
                    int length = str.substring(j, l).length();
                    if (length > max) {
                        max = length;
                        result = str.substring(j, l);
                    }
                }
            }
        }
        return (result.isEmpty()) ? "none" : result;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean palindrome(String str){
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        if (str.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public  static String Palindrome1(String str) {
        String reverse = "";
        StringBuilder xb=new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) xb.append(reverse);
        else System.out.println("not palindrome");

        return xb.toString();
    }

}
