class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str = new StringBuilder(arr[i]).reverse().toString();
            arr[i] = str;
        }
        return String.join(" ",arr);
    }
}