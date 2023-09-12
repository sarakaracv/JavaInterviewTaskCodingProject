package org.cydeo.number_tasks;

public class Number_Armstrong {

    /*
    Write a method that can check if a number is Armstrong number
     */
    public static void main(String[] args) {
        int num=153;
        System.out.println(isArmStrongNumber(num));
    }

    public static boolean isArmStrongNumber(int num) {
        int part = 0, sum = 0, first = num;

        while (num > 0) {
            part = num % 10;
            num /= 10;
            sum = sum + (part * part * part);
        }

        return (first == sum) ? true : false;
    }

}
