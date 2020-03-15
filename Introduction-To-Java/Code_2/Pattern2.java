/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to display pattern.
 */
import java.util.Scanner;

class Pattern2 {
        public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int num = in.nextInt();
        for (int i=0;i<num;i++){
            for (int j=0; j<=i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}

// Output
// Enter Rows : 5
// #
// ##
// ###
// ####
// #####