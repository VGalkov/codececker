package org.example.Collections;

import org.example.system.AbstractExampleClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
https://leetcode.com/problems/longest-repeating-character-replacement/

полловина условия не понятна.
 */

public class ExampleCollections12 extends AbstractExampleClass {
    String str = "AABABBA";
    int k = 1;

    @Override
    public void runContent() {
        List<Character> list = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (Character c : arr) {
            list.add(c);
        }
        Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        final Character[] item = {map.keySet().stream().findFirst().get()};
        final long[] counter = {0};

        map.keySet().forEach(key -> {
            if (map.get(key) > counter[0]) {
                counter[0] = map.get(key);
                item[0] = key;
            }
        });


        System.out.println(counter[0] + k);
    }
}
