package de.metro.demo.chainofresponsibility;

/**
 * Created by LaurentiuM on 2019-08-07.
 */
public class File {
    enum Type { TEXT, PRESENTATION, AUDIO, VIDEO }

    private final Type type;
    private final String content;

    public File( Type type, String content ) {
        this.type = type;
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return type + ": " + content;
    }
}
