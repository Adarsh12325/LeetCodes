class Solution {
    public int mirrorDistance(int n) {
        int x = n;
        StringBuilder sb = new StringBuilder();
        while(x>0){
            int d = x%10;
            sb.append(d);
            x = x/10;
        }
        int y = Integer.parseInt(sb.toString());
        return Math.abs(n-y);
    }
}