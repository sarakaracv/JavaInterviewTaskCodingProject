package org.cydeo.coding;

import java.util.ArrayList;
import java.util.List;

public class MatchingElements {
    public static void main(String[] args) {
        int []sa={1,2,2,5,8,8,4,7,6};
        System.out.println(matchingElements(sa));
    }
    public static List<Integer> matchingElements(int [] num){
        List<Integer> n=new ArrayList<>();

        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if (num[i]==num[j]) n.add(num[i]);
                break;
            }
        }
        return n;
    }
}
