package com.thanos.leetcode;


/**
 * @author Shi Qiang Yu
 * @date 4/8/2020 9:19 PM
 */
public class TestLeet {

    int count = 0, result = 0;

    public int kthLargest(TreeNode root, int k) {
        cal(root, k);
        return result;
    }

    public void cal(TreeNode root, int k) {
        if (null == root) {
            return;
        }
        cal(root.right, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        cal(root.left, k);
    }


//    public void calculate(TreeNode root, int k) {
//        if (root == null) {
//            return;
//        }
//        calculate(root.right, k);
//        count++;
//        System.out.println(root.val);
//        if (count == k) {
//            num = root.val;
//            return;
//        }
//        calculate(root.left, k);
//    }


    public static void main(String[] args) {
        TestLeet testLeet = new TestLeet();
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(4);

        TreeNode left = new TreeNode(1);
        left.right = new TreeNode(2);
        root.left = left;
        System.out.println("=====result: " + testLeet.kthLargest(root, 4));
    }
}


