/*
    Using (instance) Method reference create and apply add
    and subtract method and using (Static) Method reference create
    and apply multiplication method for the functional interface created.
 */

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calc = new MyCalculator()::sum;
        System.out.println("sum = " + calc.calculate(num1,num2));

        Calculator calc1 = new MyCalculator()::subtract;
        System.out.println("Difference = " + calc1.calculate(num1,num2));

        Calculator calc2 = MyCalculator::multiply;
        System.out.println("Product = " + calc2.calculate(num1,num2));
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int num1, int num2);
}

class MyCalculator {
    public int sum(int num1, int num2 ) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2 ) {
        return num1 > num2 ? num1 - num2 : num2 - num1;
    }

    public static int multiply(int num1, int num2 ) {
        return num1 * num2;
    }
}