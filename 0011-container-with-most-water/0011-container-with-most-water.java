class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int a = 0;
        int max = 0;
        while(right>left){
            int w = right-left;
            int  m = Math.min(height[left],height[right]);
            a = w*m;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            max = Math.max(max,a);
        }
        return max;
    }
}