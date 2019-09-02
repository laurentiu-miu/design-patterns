package de.metro.demo.live;

import java.util.function.Consumer;

/**
 * Created by LaurentiuM on 2019-07-25.
 *
 * Builder and Execute around pattern
 */
class Mailer{
    public static void print(String msg) {
        System.out.println(msg);
    }
    public Mailer from(String addr){print("from"); return this;}
    public Mailer to(String addr){print("to");return this;}
    public Mailer subject(String line){print("subject");return this;}
    public Mailer body(String msg){print("msg");return this;}

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("sending...");
    }
}

public class Sample5 {
    public static void main(String[] args) {
        Mailer.send(mailer->mailer.from("miu@miu.com")
        .to("cucubaou@cucu.ro")
        .subject("hello")
        .body("you are good"));
    }
}
