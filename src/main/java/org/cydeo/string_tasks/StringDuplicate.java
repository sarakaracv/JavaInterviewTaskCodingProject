package org.cydeo.string_tasks;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {
    public static void main(String[] args) {
        String dup= "saran";

        System.out.println(duplicate(dup));

    }
    public static String duplicate(String cs){
        Set<Character> st= new HashSet<>();
        StringBuffer bf= new StringBuffer();
        for (int i=0; i<cs.length();i++){
            Character ch=cs.charAt(i);
            if (!st.contains(ch)){
                st.add(ch);
                bf.append(ch);
            }

        }
        return bf.toString();
    }
}
