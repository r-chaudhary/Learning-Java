/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to display pattern.
 */
import java.util.Scanner;

class Pattern1{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int num = in.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=num; j>=i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// Output
// Enter Rows : 5
// *****
// ****
// ***
// **
// *