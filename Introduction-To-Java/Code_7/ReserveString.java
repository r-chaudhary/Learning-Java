/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to Reverse a string.
 */

import java.util.Scanner;

public class ReserveString {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Reverse of String : ");
        for(int j=str.length();j>0;j--) {
                System.out.print(str.charAt(j-1));	
        }
    }
}

// Output
// Enter String : My name is rahul. I am Learning Java.
// Reverse of String :
// .avaJ gninraeL ma I .luhar si eman yM