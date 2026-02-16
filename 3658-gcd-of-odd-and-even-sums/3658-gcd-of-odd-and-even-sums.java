class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so = n*(n+1);
        int se = n*n;
        while(so!=0){
            int t = so;
            so = se % so;
            se  =t;
        }
        return se;
    }
}