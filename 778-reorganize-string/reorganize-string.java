class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while(pq.size()>=2){
            char c1 = pq.poll();
            char c2 = pq.poll();

            sb.append(c1);
            sb.append(c2);

            map.put(c1, map.get(c1)-1);
            map.put(c2, map.get(c2)-1);

            if(map.get(c1)>0)
            pq.offer(c1);
            if(map.get(c2)>0)
            pq.offer(c2);
        }

        if(!pq.isEmpty()){
            char c = pq.poll();
            if(map.get(c)>1)
            return "";
            sb.append(c);
        }

        return sb.toString();
    }
}