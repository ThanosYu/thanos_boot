package com.thanos.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TestLeverOrder {

    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        cal(root, 0);
        return list;
    }

    private void cal(TreeNode root, int index) {
        if (null == root) {
            return;
        }
        if (list.size() == index) {
            List<Integer> innner = new ArrayList<>();
            innner.add(root.val);
            list.add(innner);
        } else {
            List<Integer> innner = list.get(index);
            innner.add(root.val);
            list.set(index, innner);
        }
        cal(root.right, index + 1);
        cal(root.left, index + 1);
    }



    public static void main(String[] args) {
        TestLeverOrder testLeet = new TestLeverOrder();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        System.out.println("=====result: " + testLeet.levelOrder(root));
    }
}
