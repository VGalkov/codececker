package org.example.algorithms;

public class TestFunctionImpl implements TestFunction<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 42;
    }
}
