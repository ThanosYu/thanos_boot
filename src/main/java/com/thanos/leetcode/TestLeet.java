package com.thanos.leetcode;


import java.util.*;

/**
 * @author Shi Qiang Yu
 * @date 4/8/2020 9:19 PM
 */
public class TestLeet {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 4, 0, target);
    }

    private static List<List<Integer>> kSum(int[] nums, int k, int start, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if (k == 2) {
            int left = start, right = nums.length - 1;
            while (left < right) {
                List<Integer> path = new LinkedList<>();
                if (nums[left] + nums[right] == target) {
                    path.add(nums[left]);
                    path.add(nums[right]);
                    res.add(path);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            for (int i = start; i < nums.length - (k - 1); i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;
                List<List<Integer>> tmp = kSum(nums, k - 1, i + 1, target - nums[i]);
                for (List<Integer> t : tmp) {
                    t.add(0, nums[i]);
                }
                res.addAll(tmp);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        TestLeet testLeet = new TestLeet();
        System.out.println(testLeet.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
