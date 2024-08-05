import java.util.*;
class Solution {
public List<Integer> findDuplicates(int[] nums) {
List<Integer> li=new ArrayList<>();
int i;
Arrays.sort(nums);
for(i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
          li.add(nums[i]);
        }
    }

return li;
}
}












