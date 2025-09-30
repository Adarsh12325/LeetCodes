class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> l = new ArrayList<>();
        if(nums==null || nums.length==0) return l ;
        int x = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i == nums.length-1 || nums[i]+1 != nums[i+1]){
                if(x == nums[i]){
                    l.add(String.valueOf(x));
                }else{
                    l.add(x+"->"+nums[i]);
                }
                if(i != nums.length-1) x= nums[i+1];
            }
            
        }
        return l;
    }
}