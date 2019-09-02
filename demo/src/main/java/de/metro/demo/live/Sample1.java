package de.metro.demo.live;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LaurentiuM on 2019-07-25.
 *
 * External iterators, internal iterators
 */
public class Sample1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //external iterators
        for(int i=0;i<=numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        for (Integer e:numbers) {
            System.out.println(e);
        }
        //internal iterators
        numbers.stream().forEach(e-> System.out.println(e));
        numbers.stream().forEach(System.out::println);
    }
}
