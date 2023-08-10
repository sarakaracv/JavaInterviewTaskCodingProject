package org.cydeo.string_tasks;


import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {
        char ch= firstNonRepeatedCharacter("aabbccdde");
        System.out.println("non repeat "+ch);
    }
    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
        int length;
        Character c;
        length=str.length();
        for (int i = 0; i < length; i++) {
            c=str.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }else {
                hm.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> each:hm.entrySet()) {
            if (each.getValue()==1){
                return each.getKey();
            }
        }
        return ' ';
    }

//    public static char getNonRepeatingChar(String str){
//        Map<Character,Integer> mp= new LinkedHashMap<Character,Integer>(str.length());
//        for (char ch:str.toCharArray()){
//            mp.put(ch,mp.containsKey(ch)?mp.get(ch)+1:1);
//        }
//        for (Map.Entry<Character,Integer> entry:mp.entrySet()){
//            if (entry.getKey()==1){
//                return entry.getKey();
//            }
//        }
//        throw new RuntimeException("not match");
//
//    }
}
