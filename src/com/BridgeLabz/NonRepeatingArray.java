package com.BridgeLabz;

import java.util.Scanner;

public class NonRepeatingArray {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements In An Array:");
        n=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("Enter The Elements Of Array: ");
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }for(int i=0; i<arr.length;i++){
            int count=0;
            for(int j=0; j<arr.length;j++){
                if(arr[j] ==arr[i]){
                    count++;
                }
            }if(count==1){
                System.out.println("Non repeating Elements Of Array Are:"+arr[i]);
            }
        }
    }
}