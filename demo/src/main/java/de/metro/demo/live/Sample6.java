package de.metro.demo.live;

import java.util.function.Consumer;

/**
 * Created by LaurentiuM on 2019-07-25.
 */
class Resource {
    private Resource(){
        System.out.println("created");
    }
    public Resource op1(){
        System.out.println("op1");
        return this;
    }
    public Resource op2(){
        System.out.println("op2");
        return this;
    }
    private void close(){
        System.out.println("cleanup ...");
    }
    public static void use(Consumer<Resource> bock){
        Resource resource = new Resource();
        try{
            bock.accept(resource);
        }finally {
            resource.close();
        }
    }
}
public class Sample6 {
    public static void main(String[] args) {
        //java 7 - ARM Automatic Resource Management
         Resource.use(resource -> resource.op1().op2());
    }
}
