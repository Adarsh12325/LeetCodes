class Solution {
    public int maxRepeating(String sequence, String word) {
        int c = 0;
        String s = word;
        while(sequence.contains(s)){
            c++;
            s += word;
        }
        return c;
    }
}