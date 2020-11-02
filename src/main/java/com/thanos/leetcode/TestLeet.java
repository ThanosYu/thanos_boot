package com.thanos.leetcode;


/**
 * @author Shi Qiang Yu
 * @date 4/8/2020 9:19 PM
 */
public class TestLeet {

    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }

    public static void main(String[] args) {
        TestLeet testLeet = new TestLeet();
        TreeNode treeNode = new TreeNode(9);
        System.out.println("=====result: " + testLeet.invertTree(treeNode));
    }
}


