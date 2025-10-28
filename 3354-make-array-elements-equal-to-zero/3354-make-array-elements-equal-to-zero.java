class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                int rightSum = total - leftSum;
                if (leftSum == rightSum) {
                    count += 2;
                } else if (Math.abs(leftSum - rightSum) == 1) {
                    count += 1;
                }
            } else {
                leftSum += num;
            }
        }
        return count;
    }
}
