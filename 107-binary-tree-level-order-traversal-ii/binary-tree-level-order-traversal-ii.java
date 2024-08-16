class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        TreeNode temp=null;
         
        while(!q.isEmpty()){
           List<Integer> list=new ArrayList<>();
            int q_size=q.size();
            for(int i=0;i<q_size;i++){
            temp=q.poll();
            list.add(temp.val);
            
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
          result.add(0,list);
        }
     
        return result;
    }
}