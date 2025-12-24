class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int s = 0;
        int j = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            s += capacity[i];
            j++;
            if (s >= sum) {
                break;
            }
        }
        return j;
    }
}