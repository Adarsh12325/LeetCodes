class Solution {
    public String reversePrefix(String word, char ch) {
        int x = -1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                x = i;
                break;
            }
        }
        char[] arr = word.toCharArray();
        if(x!=-1){
        int i=0;
        int j=x;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        }
        else{
            return word;
        }
        return new String(arr);
    }
}