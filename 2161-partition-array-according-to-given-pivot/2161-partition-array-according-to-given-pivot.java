class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }
            else if(nums[i]==pivot){
                l1.add(nums[i]);
            }
            else if(nums[i]>pivot){
                l2.add(nums[i]);
            }
        }
        l.addAll(l1);
        l.addAll(l2);
        int i=0;
        for(int a:l){
            arr[i++] = a;
        }
        return arr;
    }
}