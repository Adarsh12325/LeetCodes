class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){ //'a' "a"
            int check=0;
        for(int j=0;j<brokenLetters.length();j++){
           if(arr[i].contains(Character.toString(brokenLetters.charAt(j)))){
            check=1;
            break;
           }
        }
        if(check==0){
            count++;
        }
        }
        return count;
    }
}