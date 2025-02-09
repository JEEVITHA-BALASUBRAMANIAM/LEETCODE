class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=operations[i];
            if(s.equals("C")){
                li.remove(li.size()-1);
            }
            else if(s.equals("D")){
                li.add(2 * li.get(li.size() - 1));
            }
            else if(s.equals("+")){
                li.add(li.get(li.size() - 1)+li.get(li.size() - 2));
            }
            else{
                li.add(Integer.parseInt(s));
            }

        }
        int sum=0;
        for(int a:li ){
            sum=sum+a;
        }
        return sum;
    }
}