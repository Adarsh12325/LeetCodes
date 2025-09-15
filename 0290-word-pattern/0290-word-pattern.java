class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> x = new HashMap<>();
        HashSet<String> y = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w = arr[i];
            if(x.containsKey(c)){
                if(!x.get(c).equals(w)){
                return false;
                }
            }
            else{
            if(y.contains(w)){
                return false;
            }
            }
            x.put(c,w);
            y.add(w);
        }
        return true;
    }
}