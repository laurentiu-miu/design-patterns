package de.metro.demo.live;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by LaurentiuM on 2019-07-25.
 *
 * Decorating using lambda expression
 */
class Camera{
    private Function<Color,Color> filter;
    public Camera(Function<Color,Color>... filters){
        setFilters(filters);
    }
    public void setFilters(Function<Color,Color>... filters){
        //filter = Stream.of(filters).reduce(color->color,(theFilters, aFilter)->theFilters.andThen(aFilter));
        filter = Stream.of(filters).reduce(Function.identity(),Function::andThen);
    }
    public Color snap(Color input){
        return filter.apply(input);
    }
}
public class Sample4 {
    public static void printSnap(Camera camera){
        System.out.println(camera.snap(new Color(125,125,125)));
    }
    public static void main(String[] args) {
        printSnap(new Camera());
        printSnap(new Camera(Color::brighter));
        printSnap(new Camera(Color::brighter, Color::darker));
    }
}
