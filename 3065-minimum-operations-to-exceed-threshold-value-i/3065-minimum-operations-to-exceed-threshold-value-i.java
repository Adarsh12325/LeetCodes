class Solution {
    public int minOperations(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        for(int x: nums){
            if(x>=k) l.add(x);
        }
        return nums.length-l.size();
    }
}