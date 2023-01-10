package com.BridgeLabz;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers To Make It Sum: ");
        long num = sc.nextLong();
        long i;
        for (i = 0; num != 0; num = num / 10) {
            i = i + num % 10;
        }
        System.out.println("Sum Of Digits Of Given Number :" + i);
    }
}
