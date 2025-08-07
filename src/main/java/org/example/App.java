package org.example;

import org.example.examples.LongestCommonPrefix;
import org.example.examples.PalindromeNumber;
import org.example.examples.RomanToInteger;
import org.example.examples.TwoSum;

/**
 * тут запускаются списком все наследники AbstractExampleClass, ну или по одному.
 */
public class App {
    public static void main(String[] args) {
/*
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends AbstractExampleClass>> exampleClasses = reflections.getSubTypesOf(AbstractExampleClass.class);

        exampleClasses.forEach(item -> {
                    try {
                        (item.newInstance()).runTest();
                    } catch (InstantiationException | IllegalAccessException e) {
                        System.out.println(Arrays.toString(e.getStackTrace()));
                    }
                });

 */

        (new LongestCommonPrefix()).runTest();
    }
}