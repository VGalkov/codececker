package org.example.examples;

import org.example.system.AbstractExampleClass;

import java.util.*;
/*
https://leetcode.com/problems/roman-to-integer/description/

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

public class RomanToInteger extends AbstractExampleClass {

    @Override
    public void runContent() {
        System.out.println(convert1("IXIV"));
        System.out.println(convert1("LVIII"));
        System.out.println(convert1("MCMXCIV"));
    }

    private int convert1(String str) {
        StringBuilder sb = new StringBuilder(str);
        int rs = 0;
        Character flag = 'I';

        for (int i = sb.length() - 1; i > -1; i--) {
            switch (sb.charAt(i)) {
                case 'I': {
                    rs = flag == 'V' || flag == 'X' ? rs - 1 : rs + 1;
                    break;
                }
                case 'V': {
                    rs = rs + 5;
                    break;
                }
                case 'X': {
                    rs = flag == 'L' || flag == 'C' ? rs - 10 : rs + 10;
                    break;
                }
                case 'L': {
                    rs = rs + 50;
                    break;
                }
                case 'C': {
                    rs = flag == 'D' || flag == 'M' ? rs - 100 : rs + 100;
                    break;
                }
                case 'D': {
                    rs = rs + 500;
                    break;
                }
                case 'M': {
                    rs = rs + 1000;
                    break;
                }
            }
            flag = sb.charAt(i);
        }
        return rs;
    }


}