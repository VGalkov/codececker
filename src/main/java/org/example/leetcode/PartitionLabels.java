package org.example.leetcode;

import org.example.system.AbstractExampleClass;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/partition-labels/

не проработано нормально с вариантами.

 */
public class PartitionLabels extends AbstractExampleClass {

    @Override
    public void runContent() {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(partitionLabels("eccbbbbdec"));
    }


    public List<Integer> partitionLabels(String s) {
        List<Integer> lengths = new ArrayList<>();
        int maxId = 0;
        int point = 0;
        int[] indexes = new int[30];

        for (int i = 0; i < s.length(); ++i) {
            indexes[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); ++i) {
            maxId = Math.max(maxId, indexes[s.charAt(i) - 'a']);

            if (maxId == i) {
                lengths.add(i - point + 1);
                point = i + 1;
            }
        }

        return lengths;
    }

}
