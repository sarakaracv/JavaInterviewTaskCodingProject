package org.cydeo.coding;

import java.util.Arrays;

public class vowelsConsonants {
    public static void main(String[] args) {
        String mv="sara";
        System.out.println(vowelConsonant(mv));
    }
    public static String vowelConsonant(String str){
        int cons=0;
        int vov=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c=='a'||c=='i'||c=='e'||c=='o'||c=='u') vov++;
            else cons++;
        }
        return "vov: "+vov+" cons: "+cons;
    }
}
