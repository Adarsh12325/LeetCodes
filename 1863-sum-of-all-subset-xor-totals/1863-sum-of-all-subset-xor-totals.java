class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    private int helper(int[] nums,int idx,int curr){
        if(idx == nums.length){
            return curr;
        }
        int include = helper(nums,idx+1,curr ^ nums[idx]);
        int exclude = helper(nums,idx+1,curr);
        return include + exclude;
    }
}