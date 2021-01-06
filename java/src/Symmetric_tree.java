import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_tree {
    // recursion
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isSame(left.left, right.right) && isSame(left.right, right.left);
    }

    // iteration
    public boolean isSymmetric2(TreeNode root){
        if(root == null) return true;
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        TreeNode l, r;
        left.add(root.left);
        right.add(root.right);

        while(!left.isEmpty() && !right.isEmpty()){
            l = left.remove();
            r = right.remove();
            if(l == null && r == null) continue;
            if(l == null || r == null) return false;
            if(l.val != r.val) return false;
            left.add(l.left);
            left.add(l.right);
            right.add(r.right);
            right.add(r.left);
        }
        if(!left.isEmpty() || !right.isEmpty()) return false;
        else return true;
    }

    public static void main(String args[]){
        Integer[] nums = {1, 2, 2, 3, 4, 4, 3};
        TreeNode tn = new TreeNode();
        tn = tn.createTreeNode(nums);
        Symmetric_tree s = new Symmetric_tree();
        System.out.println(s.isSymmetric2(tn));

    }
}
