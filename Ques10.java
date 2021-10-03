/*
    Sum all the numbers greater than 5 in the integer list.
 */

import java.util.Arrays;
import java.util.List;

public class Ques10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,5,7,8,4,9);
        System.out.println("Sum of numbers greater than 5 = " +
                                    list.stream().filter(x -> x>5)
                                                 .mapToInt(x ->x)
                                                 .sum());
    }
}
