class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
        int b = i;
        int e = Math.min(i+k-1,arr.length-1);
        while(b<e){
            char temp = arr[b];
            arr[b] = arr[e];
            arr[e] = temp;
            b++;
            e--;
        }
        }
        return new String(arr);
    }
}