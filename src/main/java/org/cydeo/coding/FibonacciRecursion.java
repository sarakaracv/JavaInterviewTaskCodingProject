package org.cydeo.coding;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
