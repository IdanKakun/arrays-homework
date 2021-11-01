package com.idan.UpsideDown;

import java.util.Arrays;
import java.util.Scanner;

public class UpsideDown {
    static Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the array amount: ");
        int arrAmount=SCANNER.nextInt();
        int j=0;
        int[] rev=new int[arrAmount];
        int[] upsideDown=new int[arrAmount];
        for (int i = 0; i < upsideDown.length; i++) {
            System.out.print("Please enter a number: ");
           upsideDown[i]=SCANNER.nextInt();
        }
        for (int i = arrAmount; i > 0; i-- , j++) {
            rev[j]=upsideDown[i-1];
        }
        System.out.println("The reveres array is: " +Arrays.toString(rev));
    }
}

