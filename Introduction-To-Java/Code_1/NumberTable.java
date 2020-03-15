/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java Program to print Table of a Number
 */

import java.util.Scanner;

public class NumberTable{

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1= in.nextInt();
        for (int i=0;i<10;i++){
            System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
        }
    }
}

// Output
// Input a number: 2
// 2x1=2
// 2x2=4
// 2x3=6
// 2x4=8
// 2x5=10
// 2x6=12
// 2x7=14
// 2x8=16
// 2x9=18
// 2x10=20
