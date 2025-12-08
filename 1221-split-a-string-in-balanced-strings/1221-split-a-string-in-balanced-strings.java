class Solution {
    public int balancedStringSplit(String s) {
        int c1 = 0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') c1++;
            if(s.charAt(i)=='L') c1--;
            if(c1==0) c++;
        }
        return c;
    }
}