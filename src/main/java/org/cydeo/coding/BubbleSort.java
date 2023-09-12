package org.cydeo.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sa={2,8,9,5,7,3,4};
        bubbleSort(sa);
        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]+"");
        }

    }
    public static void bubbleSort(int [] num){
             int n=num.length;
             boolean tem;
        for (int i = 0; i < n-1; i++) {
            tem=false;
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int in = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = in;
                    tem=true;
                }
            }
            if (!tem)break;
        }
    }
}
