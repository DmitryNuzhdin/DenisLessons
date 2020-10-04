package tasks.Leetcode;

public class task226 {
    public static class TreeNode {
        public int getVal() {
            return val;
        }

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode InvertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode ptr = new TreeNode();
        ptr = root.left;
        root.left = InvertTree(root.right);
        root.right = InvertTree(ptr);
        return root;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(7);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(9);

        System.out.println(n2.getVal());
        System.out.println(n1.getVal());
        System.out.println(n3.getVal());
        System.out.println(root.getVal());
        System.out.println(n4.getVal());
        System.out.println(n5.getVal());
        System.out.println(n6.getVal());

        InvertTree(root);



        //System.out.println(sumOfLeftLeaves(root));
    }

}
