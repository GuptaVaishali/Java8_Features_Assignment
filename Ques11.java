/*
    Find average of the number inside integer list after doubling it.
 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ques11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,6,3,7,8,4);
        OptionalDouble avg = list.stream().mapToInt(x -> 2*x).average();
        System.out.println("Average = " + avg);
    }
}
