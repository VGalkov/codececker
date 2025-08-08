package org.example.Collections;


import org.example.system.AbstractExampleClass;
import org.example.system.EmptyClass;

import java.util.HashMap;
import java.util.Map;

public class ExampleObjectInMap extends AbstractExampleClass {

    @Override
    public void runContent() {
        EmptyClass exampleClass = new EmptyClass("8", "888");
        Map<String, EmptyClass> params = new HashMap<>();

        params.put("key1", exampleClass);

        EmptyClass nn = params.get("key1");

        nn.setOne("42");

        System.out.println(((EmptyClass)params.get("key1")).getOne());
        System.out.println(nn.getOne());
    }
}
