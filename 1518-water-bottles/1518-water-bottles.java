class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
       while(numBottles>=numExchange){
        int d = numBottles/numExchange;
        total = total + d;
        numBottles = numBottles%numExchange+d;
       }
       return total;
    }  
}