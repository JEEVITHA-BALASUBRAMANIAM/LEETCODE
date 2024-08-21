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


class Solution 
{
    int diam;
    int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int hgt = Math.max(left,right)+1;
        diam = Math.max(diam,left+right);
        return hgt;
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        diam = 0;
        height(root);
        return diam;
    }
}