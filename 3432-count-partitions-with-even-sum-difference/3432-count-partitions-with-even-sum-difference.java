class Solution {
    public int countPartitions(int[] nums) {
        int c = 0;
        int sum1=0;
        int sum2=0;
        int sum = 0;
        int co=0;
        
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum1+= nums[i];
            sum2= sum-sum1;
            if((sum1-sum2)%2==0){
                c++;
            }

        }
        if(c==0) return c;
        else
        return c-1;
    }
}