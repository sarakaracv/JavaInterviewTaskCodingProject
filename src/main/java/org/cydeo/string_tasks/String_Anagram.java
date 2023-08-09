package org.cydeo.string_tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */
    public static void main(String[] args) {
        String ones= "sara";
        String twice= "arsa";
        System.out.println(same(ones,twice));
    }

    // solution 1:
    public static boolean same(String a, String b) {
        char[] char1= a.toCharArray();
        char[] char2=b.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

       // String a1 = "", a2 = "";
//        for (char each : ch1) {
//            a1 += each;
//        }
//
//        for (char each : ch2) {
//            a2 += each;
//        }
//
//        return a1.equals(a2);
        return Arrays.equals(char1,char2);
    }


    // solution 2
    public static boolean Same(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }


}
