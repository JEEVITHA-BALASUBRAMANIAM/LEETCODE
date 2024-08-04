class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int remainer;
        while(x != 0) {
            remainer = x % 10;
            reverse = reverse * 10 + remainer;
            x = x/10;
        }
        return (int) reverse == reverse? (int)reverse : 0;
    }
}

























































// class Solution {
//     public int reverse(int x) {
//         int flag=0;
//         if(x<0){
//             flag=1;
//             x=Math.abs(x);
//         }
//         String s="";
//         while(x>0){
//             s+=(Integer.toString(x%10));
//             x/=10;
//         }
//         int ans=1;
//         try{
//         if(flag==1){
//              ans=Integer.parseInt(s)*-1;
//         }
//         else
//          ans=Integer.parseInt(s);
        
//     }
//     catch(Exception e){
//         return 0;
//     }
//     return ans;
//     }
// }