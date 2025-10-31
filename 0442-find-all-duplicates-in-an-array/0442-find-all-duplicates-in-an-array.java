class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x = Math.abs(nums[i])-1;
            if(nums[x]<0){
                l.add(Math.abs(nums[i]));
            }
            nums[x] = -nums[x];
        }
        return l;
    }
}