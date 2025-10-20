class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int c = 0,s = 0;
        for(int n:nums){
            s+=n;
            if(m.containsKey(s-k)){
                c+=m.get(s-k);
            }
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return c;
    }
}