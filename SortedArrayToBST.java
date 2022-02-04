/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    public TreeNode construct(int []nums,int low,int high){
        if(low>high)
            return null;

        int middle=low+(high-low)/2;
        TreeNode node=new TreeNode(nums[middle]);

        node.left=construct(nums,low,middle-1);
        node.right=construct(nums,middle+1,high);
        return node;
    }
}