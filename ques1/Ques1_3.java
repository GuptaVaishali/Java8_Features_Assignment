/*
    Write the following a functional interface and implement it using lambda:
    (3) Concatination of 2 string
    Parameter (String , String ) Return (String)
 */

package ques1;

import java.util.Scanner;

public class Ques1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.next();
        String str2 = sc.next();

        Concat concatStrings = (s1,s2) -> s1 + s2;
        System.out.println(concatStrings.concat2Strings(str1,str2));
    }

}

interface Concat{
    String concat2Strings(String str1,String str2);
}