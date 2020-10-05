package examples.lesson5;

import java.util.Stack;

public class DfsExample {
    public static void main(String[] args) {


        TreeNode example = new TreeNode(new TreeNode(new TreeNode(3), new TreeNode(4), 1) , new TreeNode(2), 0);

        invert(example);

        System.out.println(example);


    }

    private static void invert(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode onTop = stack.pop();
            if (onTop != null) {
                stack.push(onTop.left);
                stack.push(onTop.right);

                TreeNode tmp = onTop.left;
                onTop.left = onTop.right;
                onTop.right = tmp;
            }
        }
    }
}

class TreeNode {
    TreeNode left = null;
    TreeNode right = null;
    int value;

    public TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public TreeNode(int value) {
        this.value = value;
    }
}
