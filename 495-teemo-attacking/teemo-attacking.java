class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poision=duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i-1]+duration>timeSeries[i]){
                poision=poision+timeSeries[i]-timeSeries[i-1];
            }
            else {
                poision+=duration;
            }
        }
        return poision;
    }
}