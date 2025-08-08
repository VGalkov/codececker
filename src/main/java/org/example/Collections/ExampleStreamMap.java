package org.example.Collections;


import org.example.system.AbstractExampleClass;
import org.example.system.EmptyClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamMap extends AbstractExampleClass {

    @Override
    public void runContent() {
        List<EmptyClass> list = new ArrayList<EmptyClass>();

        list.add(new EmptyClass("1", "11"));
        list.add(new EmptyClass("2", "22"));
        list.add(new EmptyClass("3", "33"));

        List<String> printList = list.stream()
                .filter(item -> item.getOne().equals("1"))
                .map(EmptyClass::getTwo)
                .filter(two -> two.equals("11"))
                .collect(Collectors.toList());

        printList.forEach(System.out::println);
    }
}
