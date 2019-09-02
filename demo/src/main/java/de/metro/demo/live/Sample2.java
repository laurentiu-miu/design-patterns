package de.metro.demo.live;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LaurentiuM on 2019-07-25.
 *
 * Lightweight strategy
 */
public class Sample2 {
    public static int totalValues(List<Integer> values, Predicate<Integer> selector){
        return values.stream().filter(selector).reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //normal function
        //higher-order function
        System.out.println(totalValues(numbers, e->true));
        System.out.println(totalValues(numbers, Util::isEven));
        System.out.println(totalValues(numbers, Util::isOdd));
    }
}
class Util{
    public static boolean isEven(Integer e){
        return e%2==0;
    }
    public static boolean isOdd(Integer e){
        return e%2!=0;
    }
}
