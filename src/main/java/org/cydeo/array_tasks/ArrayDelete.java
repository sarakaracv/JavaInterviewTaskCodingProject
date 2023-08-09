package org.cydeo.array_tasks;

import java.beans.PropertyEditorManager;
import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int [] origin= {1,2,3,4,5};
        int index=4;
        int removal[]=remove(origin,index);
        System.out.println("deleting"+ Arrays.toString(origin));
        System.out.println("after"+Arrays.toString(removal));
    }
    public  static int[] remove(int[] arr, int element){
        int [] intArr= new int[arr.length-1];
         int index=0;
         for (int i=0; i<arr.length;i++){
            if (arr[i]!=element){
            intArr[index]= arr[i];
            index++;
        }
    }
    return intArr;
    }
        }
