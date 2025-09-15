class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> x = new HashMap<>();
        HashMap<Character,Character> y = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(x.containsKey(cs) && x.get(cs) != ct){
                return false;
            }
            if(y.containsKey(ct) && y.get(ct) != cs){
                return false;
            }
            x.put(cs,ct);
            y.put(ct,cs);
        }
        return true;
    }
}