package de.metro.demo.live;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.util.function.Function;

/**
 * Created by LaurentiuM on 2019-07-25.
 *
 * Decorating using lambda expression
 */
public class Sample3 {
    public static void doWork(int value, Function<Integer, Integer> func){
        System.out.println(func.apply(value));
    }
    public static void main(String[] args) {
        Function<Integer,Integer> inc = e->e+1;
        Function<Integer,Integer> doubleIt = e->e*2;
        doWork(5,inc);
        doWork(5,doubleIt);
        int temp = inc.apply(5);
        System.out.println(doubleIt.apply(temp));
        doWork(5, inc.andThen(doubleIt));
    }
}
