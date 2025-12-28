class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int c = 0;
            int x = nums[i];
            while(x>0){
                int d = x%10;
                c++;
                x=x/10;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}