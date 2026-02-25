class Solution {
    public static int bc(int x){
            String s = "";
            while(x!=0){
                int r = x%2;
                s+=r;
                x = x/2;
            }
            int c = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    c++;
                }
            }
            return c;
        }
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(bc(arr[j]) > bc(arr[j+1]) || (bc(arr[j])==bc(arr[j+1]) && arr[j]>arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}