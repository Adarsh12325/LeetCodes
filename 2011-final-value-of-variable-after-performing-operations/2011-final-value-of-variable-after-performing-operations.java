class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        int i = 0;
        while(i < operations.length){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
               X += 1;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--")){
                X -= 1;
            }
            i++;
        }
        return X;
    }
}