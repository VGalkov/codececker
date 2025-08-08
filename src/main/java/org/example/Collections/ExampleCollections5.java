package org.example.Collections;

import org.example.system.AbstractExampleClass;

import java.util.*;

public class ExampleCollections5 extends AbstractExampleClass {

    private static final List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 10, -110, 5, 8, 3));
    private static final Integer digit = 5;

    @Override
    public void runContent() {
        System.out.println(list1.indexOf(56));
        System.out.println((new HashSet(list1)).contains(5) ? list1.indexOf(56) : -1);

        Collections.min(list1);
    }


}
