package com.thanos.leetcode;

/**
 * Copyright (c) 2020 Siemens AG. All rights reserved. This software is the confidential and
 * proprietary information of Siemens AG. This file is part of thanos_boot.
 *
 * @author z003zdbc
 * @description
 * @date 11/15/2020
 */
public class Test {

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println();
    }
}
