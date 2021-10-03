/*
    Find the first even number in the integer list which is greater than 3.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,10,4,5,8,6,3,9);
        Optional<Integer> firstEvenNum = list.stream()
                                                .filter(x -> x>3)
                                                .filter(x -> x%2 == 0)
                                                .findFirst();
        System.out.println("First Even Number = " + firstEvenNum);
    }
}
