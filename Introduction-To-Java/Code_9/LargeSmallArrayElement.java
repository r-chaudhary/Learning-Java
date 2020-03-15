/**
 * Write a 
 * @author Rahul Chaudhary
 * @email r.chaudhary@outlook.in
 */
/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to find the smallest and largest element of Array.
 */

import java.util.Scanner;

public class LargeSmallArrayElement {
    public static void main(String args[]) {
        LSNum ls=new LSNum();
        ls.calculate();
    }
}
class LSNum {
    int min,max,n;
    void calculate() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int array_size=input.nextInt();
        int arr[]=new int[array_size];
        for(int i=0; i<array_size; i++) {
                System.out.print("Enter Element "+(i+1)+ ": ");
                arr[i]=input.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(int i=1; i<array_size; i++) {
            if(min>arr[i]) {
                    min=arr[i];
            }
            else if(max<arr[i]) {
                    max=arr[i];
            }
        }
        System.out.println("The smallest value is: "+min);
        System.out.println("The largest value is: "+max);
    }
}

// Output
// Enter the number of elements in array : 5
// Enter Element 1: 1
// Enter Element 2: 2
// Enter Element 3: 3
// Enter Element 4: 4
// Enter Element 5: 5
// The smallest value is: 1
// The largest value is: 5