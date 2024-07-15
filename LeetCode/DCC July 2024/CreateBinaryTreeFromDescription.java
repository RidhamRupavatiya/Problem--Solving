import java.util.*;

// import javax.swing.tree.TreeNode;


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

public class CreateBinaryTreeFromDescription {
    public static void main(String[] args) {
        int descriptions[][] = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode ans = createBinaryTree(descriptions);
        System.out.println(ans.val);
    }
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(int arr[]:descriptions){
            int parent = arr[0], child = arr[1], isLeft = arr[2];

            children.add(child);
            TreeNode current = map.getOrDefault(parent, new TreeNode(parent));

            if(isLeft == 1){
                current.left = map.getOrDefault(child, new TreeNode(child));
                map.put(child, current.left);
            }else{
                current.right = map.getOrDefault(child, new TreeNode(child));
                map.put(child, current.right);
            }

            map.put(parent, current);
        }

        int key = -1;
        for(int arr[]: descriptions){
            int parent = arr[0];
            if(!children.contains(parent)){
                key = parent;
                break;
            }
        }
        return map.get(key);
    }
}
