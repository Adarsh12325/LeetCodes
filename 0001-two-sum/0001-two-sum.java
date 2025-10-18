class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
         HashMap<Integer,Integer> m = new HashMap<>();
         for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(m.containsKey(comp)){
               arr = new int[]{m.get(comp),i};
            }
            m.put(nums[i],i);
         }
         return arr;
    }
}