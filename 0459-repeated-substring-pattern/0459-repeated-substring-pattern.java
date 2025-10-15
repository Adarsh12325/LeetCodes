class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d = s+s;
        String t = d.substring(1,d.length()-1);
        if(t.contains(s)){
            return true;
        }
        return false;
    }
}