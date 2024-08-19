class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int c:candies){
            maxcandies=Math.max(c,maxcandies);
        }
        List<Boolean> result=new ArrayList<>();
        for(int candy:candies){
           if((candy+extraCandies)>=maxcandies){
                 result.add(true);
           }
           else{
            result.add( false);
           }
        }
        return result;
    }
} 
        