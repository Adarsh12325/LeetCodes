class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            for(int l=0;l<nums.length;l++){
            min = Math.min(min,nums[l]);
        }
            for(int j=0;j<nums.length;j++){
                if(nums[j]==min){
                    nums[j]=nums[j]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}