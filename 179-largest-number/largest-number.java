class Solution {
    public String largestNumber(int[] nums) {
       String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i]+"";
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                String order1 = arr[j] + arr[j + 1];
                String order2 = arr[j + 1] + arr[j];
                if (order1.compareTo(order2)<0){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for (String num : arr) {
            largestNumber.append(num);
        }
      return largestNumber.toString();
    }
}
