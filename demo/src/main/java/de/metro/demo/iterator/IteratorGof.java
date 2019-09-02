package de.metro.demo.iterator;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by LaurentiuM on 2019-08-07.
 */
public class IteratorGof {
    static final List<Integer> list = asList( 1, 2, 3, 4, 5, 6 );

    public static void main( String[] args ) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println( iterator.next() );
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
