class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int i = 0;
        while(i<n){
        if(commands.get(i).equals("UP")) x = x-n;
        else if(commands.get(i).equals("RIGHT")) x = x+1;
        else if(commands.get(i).equals("LEFT")) x = x-1;
        else if(commands.get(i).equals("DOWN")) x = x+n;
        i++;
        }
        return x;
    }
}