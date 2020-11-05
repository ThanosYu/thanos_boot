package com.thanos.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLeverOrder1 {

    private List<List<Integer>> list = new ArrayList<List<Integer>>();
    public int[] levelOrder(TreeNode root) {
        cal(root, 0);
        List<Integer> res = new ArrayList<>();
        for (List<Integer> items:list){
            res.addAll(items);
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    private void cal(TreeNode root, int index) {
        if (null == root) {
            return;
        }
        if (list.size() == index) {
            List<Integer> inner = new ArrayList<Integer>();
            inner.add(root.val);
            list.add(inner);
        } else {
            List<Integer> inner = list.get(index);
            inner.add(root.val);
            list.set(index, inner);
        }
        cal(root.left, index + 1);
        cal(root.right, index + 1);
    }


    public static void main(String[] args) {
        TestLeverOrder1 testLeet = new TestLeverOrder1();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        System.out.println("=====result: " + Arrays.toString(testLeet.levelOrder(root)));
    }
}
