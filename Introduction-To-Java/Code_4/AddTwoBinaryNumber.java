/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to add two binary numbers.
 */

import java.util.Scanner;

public class AddTwoBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st binary number : ");
        String first = sc.nextLine();

        System.out.print("Enter 2nd binary number : ");
        String second = sc.nextLine();

        String addition = add(first,second);
        System.out.println("Addition of two binary numbers is : "+addition);
    }
    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}

// Output
// Enter 1st binary number : 1010
// Enter 2nd binary number : 1010
// Addition of two binary numbers is : 10100