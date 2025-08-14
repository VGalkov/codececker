package org.example.leetcode;

import org.example.system.AbstractExampleClass;

//Container With Most Water
//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater extends AbstractExampleClass {


    @Override
    public void runContent() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height1 = new int[]{1, 1};

        System.out.println(maxArea(height));
        System.out.println(maxArea(height1));
    }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            int square = (r - l) * Math.min(height[r], height[l]);
            res = Math.max(res, square);

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;
    }

}
