/*
    Write the following a functional interface and implement it using lambda:
    (2) Increment the number by 1 and return incremented value
    Parameter (int) Return int
 */

package ques1;

import java.util.Scanner;

public class Ques1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        incrementNumber in = (num) -> num + 1;
        System.out.println("incremented number " + in.incrementNum(n));
    }
}

interface incrementNumber{
    int incrementNum(int num);
}
