package org.example.examples;

import org.example.system.AbstractExampleClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/palindrome-number/description/

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


*/

public class PalindromeNumber extends AbstractExampleClass {
    @Override
    public void runContent() {
        System.out.println(isPalindromeV1(1000021));
        System.out.println(isPalindromeV1(121));
        System.out.println(isPalindromeV1(-121));
        System.out.println(isPalindromeV1(10));

    }

    public boolean isPalindromeV1(int x) {
   //     return x/100 == (x%100)%10;
        //1000021
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        for (int i = 0; i < sb.length()/2; i++)  {
            if (sb.charAt(i) != sb.charAt(sb.length()-1-i))
                return false;
        }
        return true;
    }

}