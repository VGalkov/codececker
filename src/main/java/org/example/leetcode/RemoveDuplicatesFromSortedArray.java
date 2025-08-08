package org.example.leetcode;

import org.example.system.AbstractExampleClass;

import java.util.*;

public class RemoveDuplicatesFromSortedArray extends AbstractExampleClass {
//    решено, но не проходит тестирование. уверен, что это лучшее решение, чем гонять цифры без хэштаблиц.

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    /*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
     */

    @Override
    public void runContent() {
        System.out.println(removeDuplicatesV1(new int[]{1,1,2}));
        System.out.println(removeDuplicatesV1(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicatesV2(new int[]{1,1,2}));
        System.out.println(removeDuplicatesV2(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public int removeDuplicatesV1(int[] nums) {
        Set<Integer> integers = new LinkedHashSet<>();
        for (int num : nums) integers.add(num);
        return integers.toArray().length;
    }

    public int removeDuplicatesV2(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }

}
