class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l = new ArrayList<>();
        for(String s:bank){
            int c = 0;
            for(char ch: s.toCharArray()){
                if(ch == '1') c++;
            }
            if(c>0) l.add(c);
        }
        int t = 0;
        for(int i=0;i<l.size()-1;i++){
            t+=l.get(i)*l.get(i+1);
        }
        return t;
    }
}