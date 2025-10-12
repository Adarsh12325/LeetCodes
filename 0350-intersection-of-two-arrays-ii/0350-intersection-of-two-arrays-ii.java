class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int a: nums1){
            if(m.containsKey(a)){
                m.put(a,m.get(a)+1);
            }else{
                m.put(a,1);
            }
        }

        for(int a: nums2){
            if(m.containsKey(a) && m.get(a)>0){
                l.add(a);
                m.put(a,m.get(a)-1);
            }
        }
        int[] arr = new int[l.size()];
        int i = 0;
        for(int a:l){
            arr[i++] = a;
        }
        return arr;
    }
}