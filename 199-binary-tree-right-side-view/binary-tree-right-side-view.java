class Solution 
{
    public List<Integer> rightSideView(TreeNode root) 
    {
         List<Integer> res  =new ArrayList<>();  
         if(root==null)
         {
            return res;
         }
         Queue<TreeNode> q = new LinkedList<>(); 
         q.offer(root);  
         while(!q.isEmpty())
         {
            int size = q.size(); 
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.poll(); 
                if(i==size-1)
                {
                    res.add(temp.val);
                } 
                if(temp.left!=null)
                {
                    q.offer(temp.left); 
                }
                if(temp.right!=null)
                {
                   q.offer(temp.right); 
                }
            }
         } 
         return res;
    }
}