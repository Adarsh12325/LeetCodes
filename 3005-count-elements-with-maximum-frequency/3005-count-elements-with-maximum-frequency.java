class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int max = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++){
        if(m.containsKey(nums[i])){
            m.put(nums[i],m.get(nums[i])+1);
        }else{
            m.put(nums[i],1);
        }
        max = Math.max(max,m.get(nums[i]));
        }
        for(int f : m.values()){
            if(f==max){
                c+=f;
            }
        }
        return c;

    }
}