package com.thanos.leetcode;

/**
 * @author Shi Qiang Yu
 * @date 10/28/2019 4:44 PM
 */
public class GuessTimes {

    public static int times(int[] a, int[] b) {
        int times = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            if (a[(int) (Math.random() * a.length)] == b[(int) (Math.random() * a.length)]) {
                times++;
            }
        }
        return times;
    }

    public static void main(String[] args) {
        int times = times(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println((int)(Math.random() * 3));
        System.out.println("==========times: " + times);
    }
}
