package org.example.examples;

import org.example.system.AbstractExampleClass;

/*
https://leetcode.com/problems/longest-common-prefix/description/


Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix extends AbstractExampleClass {

    @Override
    public void runContent() {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String prefixCandidate = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (prefixCandidate.length() > strs[i].length())
                prefixCandidate = strs[i];
        }

        String pr = "";
        if (prefixCandidate.length() > 0) {
            for (int i = 0; i < prefixCandidate.length(); i++) {
                if (check(prefixCandidate.charAt(i), strs, i)) {
                    pr = pr + prefixCandidate.charAt(i);
                } else
                    return pr;
            }
        }
        return pr;
    }

    private boolean check(char charAt, String[] strs, int j) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < j || charAt != strs[i].charAt(j)) return false;
        }

        return true;
    }
}
