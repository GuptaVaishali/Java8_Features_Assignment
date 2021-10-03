/*
    Collect all the even numbers from an integer list.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {

    static List<Integer> collectEven(List<Integer> list){
        return list.stream().filter(x -> x%2 == 0 ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,7,6,4,8,3);
        System.out.println(collectEven(list));
    }
}
