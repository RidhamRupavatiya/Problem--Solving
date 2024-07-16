// You are given the root of a binary tree with n nodes. Each node is uniquely assigned a value from 1 to n. You are also given an integer startValue representing the value of the start node s, and a different integer destValue representing the value of the destination node t.

// Find the shortest path starting from node s and ending at node t. Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:

// 'L' means to go from a node to its left child node.
// 'R' means to go from a node to its right child node.
// 'U' means to go from a node to its parent node.
// Return the step-by-step directions of the shortest path from node s to node t.


// Example 1:

// Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
// Output: "UURL"
// Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.

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

public class StepByStepDirectionFromBinaryTreeFromAnother{
    public static void main(String[] args) {
        StepByStepDirectionFromBinaryTreeFromAnother sdb = new StepByStepDirectionFromBinaryTreeFromAnother();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        // root.left.right = new TreeNode("null");
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(4);
        int startValue = 3;
        int destValue = 6;
        System.out.println(sdb.getDirections(root, startValue, destValue));
    }
    StringBuilder startPath = new StringBuilder();
    StringBuilder destPath = new StringBuilder();
    public String getDirections(TreeNode root, int startValue, int destValue) {
        dfs(root, startValue, true);
        dfs(root, destValue,false);
        startPath.reverse();
        destPath.reverse();
        int i=0, j=0;
        while(i<startPath.length() && j<destPath.length()){
            if(startPath.charAt(i) == destPath.charAt(j)){
                i++;j++;
            }else{
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(i<startPath.length()){
            sb.append("U");
            i++;
        }
        sb.append(destPath.substring(j));
        return sb.toString();
        
    }
    private boolean dfs(TreeNode root, int startValue, Boolean start){
        if(root == null) return false;

        if(root.val == startValue) return true;
        boolean left = dfs(root.left, startValue, start);
        if(left){
            if(start) this.startPath.append("L");
            else this.destPath.append("L");
            return true;
        }
        boolean right = dfs(root.right, startValue, start);
        if(right){
            if(start) this.startPath.append("R");
            else this.destPath.append("R");
            return true;
        }
        return false;
    }
}