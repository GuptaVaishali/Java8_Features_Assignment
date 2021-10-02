/*
    Implement following functional interfaces from java.util.function using lambdas:
    (1) Consumer
    (2) Supplier
    (3) Predicate
    (4) Function
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {

        //A supplier does the opposite of a consumer,
        // it takes no arguments and only returns some value.

        System.out.println("Supplier Functional Interface");
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println("Uppercase String = " + supplierStr.get());


        //   The Function interface represents a function (method) that
        //  takes a single parameter and returns a single value.

        System.out.println("Function Interface");
        Function<Long, Long> adder = (value) -> value + 3;
        Long resultLambda = adder.apply((long) 8);
        System.out.println("result = " + resultLambda);


        //a Predicate is a functional interface that
        // can be used anywhere you need to evaluate a boolean condition.

        System.out.println("Predicate Interface");
        Predicate<String> isALongWord = s -> s.length() > 10;
        String s = "successfully";
        boolean result = isALongWord.test(s);
        System.out.println("String length greater than 10 " + result);


        //A consumer is an operation that
        // accepts a single input argument and returns no result;
        // it just execute some operations on the argument.

        System.out.println("Consumer Interface");
        Consumer<String> consumeStr = str -> System.out.println("Hi " + str);
        consumeStr.accept("Vaishali");
    }
}
