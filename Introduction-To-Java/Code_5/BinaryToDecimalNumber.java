/**
 * Write a Java program to convert a binary number to decimal number.
 * @author Rahul Chaudhary
 * @email r.chaudhary@outlook.in
 */
/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to convert a Binary Number to Decimal Number.
 */
import java.util.Scanner;

public class BinaryToDecimalNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long num = sc.nextLong();
        int decimal = convertBinaryToDecimal(num);
        System.out.print(num+" in binary. "+decimal+" in decimal.");
    }
    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while(num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder*Math.pow(2,i);
            ++i;
        }
        return decimalNumber;
    }
}

// Output
// Enter a binary number: 101
// 101 in binary. 5 in decimal.
