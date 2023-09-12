package org.cydeo.coding;

public class ReverseArray {
    public static void main(String[] args) {
        int[]num={9,8,6,7,2,6};
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    public static void reverse(int[]num){
        for (int i = 0; i <num.length/2 ; i++) {
            int temp=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=temp;
        }
    }
}
