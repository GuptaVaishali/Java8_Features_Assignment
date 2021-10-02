/*
    Write the following a functional interface and implement it using lambda:
    (1) First number is greater than second number or not
     Parameter (int ,int ) Return boolean
 */

package ques1;

import java.util.Scanner;

public class Ques1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        greaterNumber fs = (Num1,Num2) -> Num1>Num2;
        boolean result = fs.isFirstNumberGreaterThanSecond(firstNum,secondNum);
        System.out.println(result);
    }
}

interface greaterNumber{
    boolean isFirstNumberGreaterThanSecond(int first,int second);
}
