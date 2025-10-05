class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int x = n;
        while(x%3==0){
            x /= 3;
        }
        return x==1;
    }
}