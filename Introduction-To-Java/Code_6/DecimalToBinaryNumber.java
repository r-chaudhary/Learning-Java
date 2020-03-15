/**
 * Write a Java program to convert a decimal number to binary number.
 * @author Rahul Chaudhary
 * @email r.chaudhary@outlook.in
 */
/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to convert a Decimal number to Binary number.
 */

import java.util.Scanner;

public class DecimalToBinaryNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.println("Decimal to Binary:" +Integer.toBinaryString(num));
    }
}

// Output
// Enter a decimal number: 5
// Decimal to Binary:101