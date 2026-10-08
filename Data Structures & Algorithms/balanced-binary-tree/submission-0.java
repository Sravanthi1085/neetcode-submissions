/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root ==null){
            return true;
        }
        int left=Height(root.left);
        int right=Height(root.right);
        if(Math.abs(left-right)>1) return false;
        boolean l=isBalanced(root.left);
        boolean r=isBalanced(root.right);
        if(!l || !r) return false;
        return true;
    }
    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        return 1+Math.max(lh,rh);
    }
}
