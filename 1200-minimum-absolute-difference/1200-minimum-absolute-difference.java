class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i-1]));        
        }
        for(int i=1;i<arr.length;i++){
            if(min == Math.abs(arr[i]-arr[i-1])) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(arr[i-1]);
                l1.add(arr[i]); 
                l.add(l1); 
            }
        }
        return l;
    }
}