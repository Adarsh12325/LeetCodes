class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> n= new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
        if(n.contains(nums[i])){
            return true;
        }
        n.add(nums[i]);

        if (n.size() > k) {
                n.remove(nums[i - k]);
            }
        }
        return false;
    }
}