package org.example.examples;

import org.example.system.AbstractExampleClass;
/*
https://leetcode.com/problems/length-of-last-word/description/

*/

public class LengthLastWord extends AbstractExampleClass {


    @Override
    public void runContent() {
        System.out.println(lengthOfLastWord1("Hello World"));
        System.out.println(lengthOfLastWord1("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord1("luffy is still joyboy"));

        System.out.println(lengthOfLastWord2("Hello World"));
        System.out.println(lengthOfLastWord2("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord2("luffy is still joyboy"));
    }

    public int lengthOfLastWord1(String s) {
        String[] strArr = s.split(" ");
        String str = strArr[strArr.length - 1];
        return str.length();
    }

    public int lengthOfLastWord2(String s) {
        s = s.stripTrailing();
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                return length;
            }
            length++;
        }
        return length;
    }
}