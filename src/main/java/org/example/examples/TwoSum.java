package org.example.examples;

import org.example.system.AbstractExampleClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/two-sum/submissions/1726248025/
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

public class TwoSum extends AbstractExampleClass {
    private final int target = 9;
    private final int[] arr = {2, 7, 11, 15};
    @Override
    public void runContent() {
        System.out.println(Arrays.toString(twoSumV1(arr, target)));
        System.out.println(Arrays.toString(twoSumV2(arr, target)));
    }

    public int[] twoSumV1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && target - nums[i] == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public int[] twoSumV2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++)
             if (nums[i]+nums[j] == target) {
                 return new int[]{i, j};
             }
        }
        return null;
    }


    public int[] twoSumV3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
