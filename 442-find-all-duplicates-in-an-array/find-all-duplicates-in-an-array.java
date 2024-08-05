import java.util.ArrayList;
import java.util.List;
class Solution {
public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                result.add(index + 1);
            }
        }

        return result;
    }
}














