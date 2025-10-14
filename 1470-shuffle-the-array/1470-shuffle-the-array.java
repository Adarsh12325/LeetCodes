class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> l = new ArrayList<>();
        int i=0,j=n;
        while(i<n && j<nums.length){
            l.add(nums[i]);
            l.add(nums[j]);
            i++;
            j++;
        }
        int[] arr = new int[l.size()];
        int idx = 0;
        for(int a:l){
            arr[idx++] = a;
        }
        return arr;
    }
}