package org.example.algorithms;

@FunctionalInterface
public interface TestFunction<T> {

    boolean test(T t);
}
