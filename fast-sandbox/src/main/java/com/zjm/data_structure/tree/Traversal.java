package com.zjm.data_structure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @className : Traversal
 * @description: 树的遍历
 * @author: zhangjm
 * @create: 2020-06-01 13:39
 **/
public class Traversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

//        preorder(root, res);
        preorderStack(root, res);

        return res;
    }

    /**
     * 递归
     * @param root
     * @param res
     */
    private void preorder(TreeNode root, List<Integer> res){
        if(root != null){
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }

    /**
     * 迭代
     * 将其孩子节点压入栈中，先压右孩子再压左孩子
     * @param root
     * @param res
     */
    private void preorderStack(TreeNode root, List<Integer> res){
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {

    }
}
