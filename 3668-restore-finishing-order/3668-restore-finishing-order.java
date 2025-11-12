class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> l= new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i: friends){
            s.add(i);
        }
        for(int a: order){
            if(s.contains(a)){
                l.add(a);
            }
        }
        int[] arr = new int[l.size()];
        int i=0;
        for(int a:l){
            arr[i++] = a;
        }
        return arr;
    }
}