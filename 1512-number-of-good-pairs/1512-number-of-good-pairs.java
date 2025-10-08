class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        int sum = 0;
        for(int n: m.values()){
            sum += n*(n-1)/2;
        }
        return sum;
    }
}