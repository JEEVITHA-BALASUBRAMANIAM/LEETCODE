class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        HashMap <String, Integer> hm = new HashMap<>();
        for(int i=0;i< list1.length;i++) {
            hm.put(list1[i], i);
        }
        int count=0;
        int minval = Integer.MAX_VALUE;
        List<String> op = new ArrayList<>();
        for(int i=0;i< list2.length&& i <= minval;i++) {
            Integer x = hm.get(list2[i]);
            if(x!=null) {
                    if(minval> x+i){
                        op.add(0,list2[i]);
                        minval=x+i;
                        count=1;
                    } else if(minval == x+i) {
                    op.add(count++, list2[i]);
                    }
            }
        }
        return op.subList(0, count).toArray(new String[0]);
    }
}