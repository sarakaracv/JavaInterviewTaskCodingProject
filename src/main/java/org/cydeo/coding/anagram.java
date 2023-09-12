package org.cydeo.coding;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String ana="god";
        String gr="dog";
        System.out.println(anagram(ana,gr));
    }
    public static boolean anagram(String str, String sr){
        boolean non= false;
        char src[]= sr.toCharArray();
        char strc[]= str.toCharArray();
        for (char[] chars : Arrays.asList(src, strc)) {
            Arrays.sort(chars);
        }
        non = Arrays.equals(src,strc);
        return non? true: false;

    }
}
