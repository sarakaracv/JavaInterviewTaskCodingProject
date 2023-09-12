package org.cydeo.coding;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={8,9,5,4,2,6};
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void insertion(int []num){
        for (int i = 1; i < num.length ; i++) {
            int in=i;
            while (in>0&&num[in-1]>num[in]){
                int temp= num[in];
                num[in]=num[in-1];
                num[in-1]=temp;
                in--;
            }
        }
    }
}
