package org.example.examples;

import org.example.system.AbstractExampleClass;

import java.util.*;

public class ValidParentheses_RETURN extends AbstractExampleClass {

    // --------------------- Не решено.




    @Override
    public void runContent() {
    //    System.out.println(isValid("()"));
     //   System.out.println(isValid("(]"));

    //    System.out.println(isValid("()[]{}"));
    //    System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));

    }

    List<Character> open = new ArrayList<>(Arrays.asList('(', '{', '['));
    List<Character> close = new ArrayList<>(Arrays.asList(')', '}', ']'));
    Set<Integer> usedIndexes;

    public boolean isValid(String s) {
        usedIndexes = new HashSet<>();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (!usedIndexes.contains(i) && open.contains(s.charAt(i)) & !findValidClose(i, s, open.indexOf(s.charAt(i))))
                return false;
        }
        return true;
    }

    private boolean findValidClose(int openChrIndex, String s, int idx) {
        for (int j = s.length() - 1; j > openChrIndex; j--) {
            if (!usedIndexes.contains(j) && s.charAt(j) == close.get(idx)) {
                usedIndexes.add(openChrIndex);
                usedIndexes.add(j);
                return true;
            }
        }
        return false;
    }


}
