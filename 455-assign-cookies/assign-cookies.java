class Solution {
    public int findContentChildren(int[] g, int[] s)
    {
        int n,m; 
        n = g.length; 
        m = s.length; 
        Arrays.sort(g); 
        Arrays.sort(s);  
        int left = 0,right = 0;
        while(left<m && right<n)
        {
             if(s[left]>=g[right])
             {
                right++;
             }
             left++;
        } 
        return right;
    }
}