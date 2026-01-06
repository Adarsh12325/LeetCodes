class Solution {
    public int diagonalSum(int[][] mat) {
        int s1 = 0;
        int s2 = 0;
        int l = mat.length;
        int i=0;
        int j=0;
        int m = mat.length/2;
        while(i<mat.length && j<mat[i].length && l>=0){
                if(i==j){
                    s1+=mat[i][j];
                    s2+=mat[i][l-1];
                }
                i++;
                j++;
                l--;
            }
            if(mat.length%2==0){
                return s1+s2;
            }else{
                return (s1+s2)-mat[m][m];
            }
        }
    }
