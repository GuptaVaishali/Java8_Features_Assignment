/*
     Write the following a functional interface and implement it using lambda:
     (4) Convert a string to uppercase and return .
     Parameter (String) Return (String)
 */

package ques1;

import java.util.Scanner;

public class Ques1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        uppercase up = s -> s.toUpperCase();
        System.out.println(up.convertIntoUppercase(str));
    }
}

interface uppercase{
    String convertIntoUppercase(String str);
}