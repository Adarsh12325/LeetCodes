class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                int l = t.get(i-1).get(j-1);
                int r = t.get(i-1).get(j);
                row.add(l+r);
            }
            if(i>0) row.add(1);
            t.add(row);
        }
        return t;
    }
}