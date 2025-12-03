class Solution {
    public int smallestEvenMultiple(int n) {
        int min = n*2;
        for(int i=0;i<n*2;i++){
            if(i%2==0 && i%n==0 && i>0){
                min = Math.min(min,i);
            }
        }
        return min;
    }
}