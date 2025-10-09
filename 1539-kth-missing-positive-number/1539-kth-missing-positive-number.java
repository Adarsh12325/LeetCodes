class Solution {
    public int findKthPositive(int[] arr, int k) {
        int element = 1;
        int i = 0;
        int missing = 0;
        while(missing < k){
            if(i < arr.length && arr[i]==element){
                i++;
            }
            else{
                missing++;
                if(missing==k){
                    return element;
                }
            }
            element++;
        }
        return 0;
    }
}