package com.idan.minilarge;

import java.util.Arrays;
import java.util.Scanner;

public class MiniLarge {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the array amount: ");
        int arrAmount = SCANNER.nextInt();
        final int[] arr = new int[arrAmount];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a number: ");
            arr[i] = SCANNER.nextInt();
        }
        Arrays.sort(arr);
        int lastNum= arr[arr.length - 1];
        System.out.println("The smallest number in the array is: " + arr[0]);
        System.out.println("The largest number in the array is: " +lastNum);
    }
}
