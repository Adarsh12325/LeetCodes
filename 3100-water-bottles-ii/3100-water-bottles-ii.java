class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles>=numExchange){
            numBottles = numBottles-numExchange+1;
            numExchange+=1;
            total+=1;
        }
        return total;
    }
}