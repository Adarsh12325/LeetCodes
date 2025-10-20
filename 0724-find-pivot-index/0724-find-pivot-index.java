class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;
        int sum = 0;
        for(int n:nums) sum+=n;
        for(int i=0;i<nums.length;i++){
            rSum = sum - lSum - nums[i];
            if(lSum == rSum) return i;
            lSum += nums[i];
        }
        return -1;
    }
}