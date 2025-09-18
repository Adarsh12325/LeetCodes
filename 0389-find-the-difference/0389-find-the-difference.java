class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> Map1 = new HashMap<>();
        HashMap<Character,Integer> Map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
        if(Map1.containsKey(s.charAt(i))){
            Map1.put(s.charAt(i),Map1.get(s.charAt(i))+1);
        }else{
            Map1.put(s.charAt(i),1);
        }
        if(Map2.containsKey(t.charAt(i))){
            Map2.put(t.charAt(i),Map2.get(t.charAt(i))+1);
        }else{
            Map2.put(t.charAt(i),1);
        }
        }
        if(Map2.containsKey(t.charAt(s.length()))){
            Map2.put(t.charAt(s.length()),Map2.get(t.charAt(s.length()))+1);
        }else{
            Map2.put(t.charAt(s.length()),1);
        }
        for(int i=0;i<t.length();i++){
            if(Map2.get(t.charAt(s.length()))==1) return t.charAt(s.length());
        else if((int)Map2.get(t.charAt(i))>(int)Map1.get(t.charAt(i))) return t.charAt(i);
        }
        return 'a';
    }
}
