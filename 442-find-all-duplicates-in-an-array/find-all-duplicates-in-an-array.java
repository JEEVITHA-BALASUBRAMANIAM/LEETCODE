import java.util.ArrayList;
import java.util.List;
class Solution {
public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> result = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1;
//             if (nums[index] > 0) {
//                 nums[index] = -nums[index];
//             } else {
//                 result.add(index + 1);
//             }
//         }

//         return result;
//     }
// }




ArrayList<Integer> li=new ArrayList<>();

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












