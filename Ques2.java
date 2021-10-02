/*
    Create a functional interface whose method takes 2 integers
    and return one integer.
 */

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Operation op = (n1,n2) -> n1+n2;
        System.out.println("Sum of numbers = " + op.sum2nums(num1,num2));
    }
}

interface Operation{
    int sum2nums(int num1,int num2);
}
