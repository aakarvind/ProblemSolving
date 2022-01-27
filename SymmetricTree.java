/**
 * https://leetcode.com/problems/symmetric-tree/
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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricUtil(root.left,root.right);
    }

    boolean isSymmetricUtil(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        else if(left==null)
            return false;
        else if(right==null)
            return false;
        else{
            if(left.val==right.val){
                return (isSymmetricUtil(left.left,right.right) && isSymmetricUtil(left.right,right.left));
            }else{
                return false;
            }
        }
    }

}
