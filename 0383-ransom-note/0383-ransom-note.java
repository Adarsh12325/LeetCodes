class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<magazine.length();i++){
            for(int j=i;j<magazine.length();j++){
                String s = magazine.substring(i,j);
                if(s.equals(ransomNote)){
                    return true;
                }
            }
        }
        return false;
    }
}