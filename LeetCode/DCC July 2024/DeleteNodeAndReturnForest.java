import java.util.*;

// Definition for a binary tree node.
class TreeNode {
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

class DeleteNodeAndReturnForest{
    public static void main(String[] args) {
        DeleteNodeAndReturnForest dnrf = new DeleteNodeAndReturnForest();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
        int to_delete[] = {3,5};
        List<TreeNode> ans = dnrf.delNodes(root, to_delete);
        for(TreeNode r:ans){
            printTree(r);
            System.out.println();
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }
        List<TreeNode> ans = new ArrayList<>();
        if(!set.contains(root.val)) ans.add(root);
        traverse(root, set, ans);
        return ans;
    }
    private TreeNode traverse(TreeNode root, Set<Integer> set, List<TreeNode> ans) {
        if(root == null) return null;
        root.left = traverse(root.left, set, ans);
        root.right = traverse(root.right, set, ans);
        if(set.contains(root.val)) {
            if(root.left != null) ans.add(root.left);
            if(root.right != null) ans.add(root.right);
            return null;
        }
        return root;
    }
    private static void printTree(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
}