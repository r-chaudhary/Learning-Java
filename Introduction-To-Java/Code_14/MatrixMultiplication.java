/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to multiply two Matrices and print the resultant matrix. 
 */

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        int r1,c1,r2,c2,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows & columns of first matrix:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        int first[][]=new int[r1][c1];
        System.out.println("Enter elements of first matrix: ");
        for (i=0; i<r1; i++) {
            for (j=0; j<c1; j++) {
                    first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows & columns of second matrix:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if (c1!=r2)
        System.out.println("The matrices can't be multiplied with each other");
        else {
            int second[][]=new int[r2][c2];
            int multiply[][]=new int[r1][c2];
            System.out.println("Enter elements of second matrix: ");
            for (i=0; i<r2; i++) 
                for (j=0; j<c2; j++)
                    second[i][j]=sc.nextInt();

            for (i=0; i<r1; i++) {
                for (j=0; j<c1; j++) {
                    for (k=0; k<c1; k++) {
                        multiply[i][j]=multiply[i][j]+first[i][k]*second[k][j];
                    }
                }
            }
            System.out.println("Product of Matrices: ");
            for (i=0; i<r1; i++) {
                for (j=0; j<c2; j++) {
                        System.out.print(multiply[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}

// Output
// Enter the number of rows & columns of first matrix:
// 2
// 2
// Enter elements of first matrix:
// 1
// 2
// 3
// 4
// Enter the number of rows & columns of second matrix:
// 2
// 2
// Enter elements of second matrix:
// 3
// 4
// 5
// 6
// Product of Matrices:
// 13      16
// 29      36