class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        long m = Long.MIN_VALUE;
        long sm = Long.MIN_VALUE;
        long tm = Long.MIN_VALUE;
        int dc = 0;
        for(int num:nums){
            long n = num;
            if(n==m||n==sm||n==tm) continue;
            if(n>m){
                tm = sm;
                sm = m;
                m = n; 
                dc++;
            }
            else if(n > sm){
                tm = sm;
                sm = n;
                dc++;
            }else if(n > tm){
                tm = n;
                dc++;
            }
        }
        return dc >= 3?(int) tm:(int)m;
    }
}