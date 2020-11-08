package com.thanos.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TestLeverOrder2 {

    private List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        cal(root, 0);
        return list;
    }

    private void cal(TreeNode root, int level) {
        if (null == root) {
            return;
        }
        if (list.size() <= level) {
            List<Integer> innner = new ArrayList<Integer>();
            innner.add(root.val);
            list.add(innner);
        } else {
            List<Integer> innner = list.get(level);
            // left order or right order
            if (level % 2 == 0) {
                innner.add(root.val);
            } else {
                innner.add(0, root.val);
            }
            list.set(level, innner);
        }
        cal(root.left, level + 1);
        cal(root.right, level + 1);
    }


    public static void main(String[] args) {
        TestLeverOrder2 testLeet = new TestLeverOrder2();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;


//        TreeNode root = new TreeNode(1);
//
//        TreeNode left = new TreeNode(2);
//        left.left = new TreeNode(4);
//        left.right = new TreeNode(5);
//        root.left = left;
//        root.right = new TreeNode(3);
        System.out.println("=====result: " + testLeet.levelOrder(root));
    }
}
