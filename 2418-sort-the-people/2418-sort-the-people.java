class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> m = new HashMap<>();
        for(int i=0;i<names.length;i++){
            m.put(heights[i],names[i]);
        }
        Integer[] arr = new Integer[heights.length];
        for(int i=0;i<names.length;i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        String[] a = new String[names.length];

        for(int i=0;i<a.length;i++){
            a[i] = m.get(arr[i]);
        }
        return a;
    }
}