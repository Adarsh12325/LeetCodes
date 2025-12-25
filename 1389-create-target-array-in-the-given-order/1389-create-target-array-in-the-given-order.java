class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int a:l){
            ans[idx++] = a;
        }
        return ans;
    }
}