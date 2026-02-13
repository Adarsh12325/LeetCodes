class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double min = 51;
        int[] arr = new int[nums.length/2];
        for(int i=0;i<nums.length/2;i++){
            double x = (double)(nums[i]+nums[n-i-1])/2;
            min = Math.min(min,x);
        }
        return min;
    }
}