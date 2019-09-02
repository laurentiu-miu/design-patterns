package de.metro.demo.template;

import java.util.function.Consumer;

/**
 * Created by LaurentiuM on 2019-08-07.
 */
public class TemplateLambda {
    public static void withResource( Consumer<Resource> consumer) {
        Resource resource = new Resource();
        try {
            consumer.accept( resource );
        } finally {
            resource.dispose();
        }
    }

    public static void main( String[] args ) {
        withResource( resource -> resource.useResource() );
        withResource( resource -> resource.employResource() );
    }
}
