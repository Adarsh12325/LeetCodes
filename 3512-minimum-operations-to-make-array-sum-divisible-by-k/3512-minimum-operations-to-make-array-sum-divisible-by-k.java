class Solution {
    public int sums(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int minOperations(int[] nums, int k) {
        // int sum = 0;
        // int count = 0;
        // sum = sums(nums);
        // while(sum%k!=0){
        //     sum--;
        //     count++;
        // }
        // return count;
        return sums(nums)%k;
    }
}