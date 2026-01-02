class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        int x = 0;
        for(int i =0;i<nums.length;i++){
            if(m.get(nums[i])==nums.length/2){
                x = nums[i];
            }else{
                continue;
            }
        }
        return x;
    }
}