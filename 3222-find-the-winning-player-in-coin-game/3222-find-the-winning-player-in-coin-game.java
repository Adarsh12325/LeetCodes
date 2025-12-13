class Solution {
    public String winningPlayer(int x, int y) {
        int z = Math.min(min,(x,y/4));
        if(z%2==0) return "Bob";
        else return "Alice";
    }
}