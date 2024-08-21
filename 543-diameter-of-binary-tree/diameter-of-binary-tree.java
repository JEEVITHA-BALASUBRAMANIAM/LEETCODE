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




//           1 (root) [height = max(left_sub_tree ,right_sub_tree)]
//         /   \
//        /     \ 
//       2       3 
//     /   \ 
//    /     \ 
//   4       5
  
// 3


// start => root
// if -> there is no node stop the calling (null)
// on termination of calling return 0 as a subtree height
// diam = max(prev_diam , left+right);
// max(left_subtree_height , right_subtree_height)