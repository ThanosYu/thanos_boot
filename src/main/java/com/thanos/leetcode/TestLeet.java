package com.thanos.leetcode;


import java.util.Arrays;

/**
 * @author Shi Qiang Yu
 * @date 4/8/2020 9:19 PM
 */
public class TestLeet {

    public String[] findRelativeRanks(int[] nums) {
        int[] tempArray = nums.clone();
        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = 0; j < tempArray.length - 1 - i; j++) {
                if (tempArray[j] < tempArray[j + 1]) {
                    int tmp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(tempArray));
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == tempArray[0]) {
                res[i] = "Gold Medal";
            } else if (nums[i] == tempArray[1]) {
                res[i] = "Silver Medal";
            } else if (nums[i] == tempArray[2]) {
                res[i] = "Bronze Medal";
            } else {
                for (int j = 3; j < tempArray.length; j++) {
                    if (nums[i] == tempArray[j]) {
                        res[i] = String.valueOf(j + 1);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TestLeet testLeet = new TestLeet();
        System.out.println((Arrays.toString(testLeet.findRelativeRanks(new int[]{9, 2, 6, 5, 7}))));
    }
}


