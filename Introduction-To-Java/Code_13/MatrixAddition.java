/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to add two Matrices and print the resultant matrix. 
 */
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]) {
        int m,n,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows and columns of a matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        int first[][]=new int[m][n];
        int second[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter the elements of first matrix: ");
        for(c=0;c<m;c++) {
            for(d=0;d<n;d++) {
                System.out.print("Enter Element : ");
                first[c][d]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of second matrix: ");
        for(c=0;c<m;c++) {
            for(d=0;d<n;d++) {
                System.out.print("Enter Element : ");
                second[c][d]=sc.nextInt();
            }
        }
        
        for(c=0;c<m;c++)
            for(d=0;d<n;d++)
                sum[c][d]=first[c][d]+second[c][d];
        
        System.out.println("Sum of matrices: ");
        for(c=0;c<m;c++) {
            for(d=0;d<n;d++)
                System.out.print(sum[c][d] +"\t");
            
                System.out.println();
        }
    }
}

// Output
// Enter the rows and columns of a matrix: 2
// 2
// Enter the elements of first matrix:
// Enter Element : 1
// Enter Element : 2
// Enter Element : 3
// Enter Element : 4
// Enter the elements of second matrix:
// Enter Element : 5
// Enter Element : 6
// Enter Element : 7
// Enter Element : 8
// Sum of matrices:
// 6       8
// 10      12