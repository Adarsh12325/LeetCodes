class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Integer,Integer> m = new HashMap<>();
       m.put(0,-1);
       int s=0;
       for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(k!=0) s%=k;
            if(m.containsKey(s)){
                if(i-m.get(s)>1) return true;
            }
            else{
                m.put(s,i);
            }
       }
       return false;
    }
}