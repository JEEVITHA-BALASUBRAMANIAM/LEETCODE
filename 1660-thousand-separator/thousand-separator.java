class Solution {
    public String thousandSeparator(int n) {
        if(n == 0){
            return "0";
        }
        StringBuilder arr = new StringBuilder();
        while(n > 999){
            arr.insert(0,n%1000);
            if(n%1000 < 100){
                arr.insert(0,'0');
            }
            arr.insert(0,'.');
            n/=1000;
        }
        if(n > 0){
            arr.insert(0,n);
        }
        return arr.toString();
    }
}