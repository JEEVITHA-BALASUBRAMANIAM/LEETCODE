class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hs=new HashSet<>();
        for(int n : candyType){
            hs.add(n);
        }
        int n=candyType.length/2;
        if(n>=hs.size()){
            return hs.size();
        }
        else{
            return n;
        }
    }
}