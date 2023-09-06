package org.cydeo.interview;

public class Fibonacci {
    public static void main(String[] args) {
    int n=9;
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n){
        int [] fib= new int[n];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <n ; i++) {
        fib[i]=fib[i-1]+fib[i-2];
         }
        for (int i = 0; i <n ; i++) {
            System.out.println(fib[i]+" ");
        }

        return -1;
    }

}
