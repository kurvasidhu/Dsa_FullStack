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
    boolean f=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int r=help(root);
        return f;
    }

    public int help(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=help(node.left);
        int r=help(node.right);
        if((int)Math.abs(l-r)>1){
            f=false;
        }

        return Math.max(l,r)+1;
        
    } 
}