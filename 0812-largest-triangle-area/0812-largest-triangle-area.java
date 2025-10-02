class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0.0;
        int s = points.length;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                for(int k=j+1;k<s;k++){
                    double a = Math.abs(points[i][0]*(points[j][1]-points[k][1])+
                    points[j][0]*(points[k][1]-points[i][1])+
                    points[k][0]*(points[i][1]-points[j][1]))/2.0;
                    max = Math.max(max,a);
                }
            }
        }
        return max;
    }
}