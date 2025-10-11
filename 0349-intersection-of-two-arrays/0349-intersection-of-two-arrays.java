class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        for(int a: nums1){
            s1.add(a);
        }

        HashSet<Integer> r = new HashSet<>();
        for(int a: nums2){
            if(s1.contains(a)){
                r.add(a);
            }
        }

        int[] arr = new int[r.size()];
        int i=0;
        for(int a: r){
            arr[i++] = a;
        }
        return arr;
    }
}