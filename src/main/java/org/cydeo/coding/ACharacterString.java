package org.cydeo.coding;

public class ACharacterString {
    public static void main(String[] args) {
        String ch= "unitedstates";
        System.out.println(chara(ch));
    }
    public static int chara(String str){
        int count=0;
        char d='a';
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==d){
                count++;
            }
        }

        return count;

    }
}
