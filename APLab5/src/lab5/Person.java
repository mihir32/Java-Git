package lab5;

public abstract class Person {
    String name;

    abstract boolean respondsTo(String knownAs);

    abstract void println();
}
