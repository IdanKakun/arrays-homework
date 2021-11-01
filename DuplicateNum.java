package com.idan.DuplicateNum;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNum {
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the array amount: ");
        int arrAmount = SCANNER.nextInt();
        int[] arr = new int[arrAmount];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a number: ");
            arr[i] = SCANNER.nextInt();
        }
        Arrays.sort(arr);
       System.out.print("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j=i+1;j < arr.length; j++){
                if (arr[j]==arr[i]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}

