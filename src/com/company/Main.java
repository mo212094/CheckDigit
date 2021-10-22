package com.company;

import java.util.Scanner;

public class Main {
    // See teams for reference photo
    // Inputting barcode/number as an array
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter barcode (Enter numbers one by one):");
    int[] barcode = new int[13];
    for (int i = 0; i < barcode.length; i++ ) {
        barcode[i] = input.nextInt();
    }
    // 2. and 4. Adding every other numbers
    int check1 = barcode[1] + barcode[3] +barcode[5] +barcode[7] +barcode[9] +barcode[11];
    int check2 = barcode[0]+ barcode[2] + barcode[4] +barcode[6] +barcode[8] +barcode[10];
    // 4. Multiplying sum of odd place numbers added by 3
    int check3 = check1 * 3;
    // 5. Adding the result to sum even place numbers
    int check4 = check2 + check3;
    // 6. Adding check number
    int finalCheck = check4 + barcode[12];
    // 6. Checking it equals 80 and if not it is incorrect
    if (finalCheck == 80) {
        System.out.println("Check digit correct");
    } else {
        System.out.println("Check digit incorrect");
    }

    }
}
