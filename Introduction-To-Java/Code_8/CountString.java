/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to count the letters, spaces, numbers and other characters of an input string.
 */

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");		
        Scanner sc = new Scanner(System.in);
        String test=sc.nextLine();
        char[] ch=test.toCharArray();
        int letter=0;
        int space=0;
        int number=0;
        int otherchar=0;
        for(int i=0; i<test.length(); i++) {
            if(Character.isLetter(test.charAt(i))) {
                    letter ++;
            }
            else if(Character.isDigit(ch[i])) {
                    number ++;
            }
            else if(Character.isSpaceChar(ch[i])) {
                    space ++;
            }
            else {
                    otherchar ++;
            }
        }
        System.out.println("The string is: "+test);
        System.out.println("letter: "+letter);
        System.out.println("space: "+space);
        System.out.println("number: "+number);
        System.out.println("other: "+otherchar);
    }
}

// Output
// Enter String :
// My name is Rahul I am 19 years old.
// The string is: My name is Rahul I am 19 years old.
// letter: 24
// space: 8
// number: 2
// other: 1