class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = getNextGreater(nums1[i], nums2);
        }
        return result;
    }

    public int getNextGreater(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (i = i + 1; i < arr.length; i++) {
                    if (num < arr[i]) {
                        return arr[i];
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}