class Solution {
    public String convert(int n,int base){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%base);
            n = n/base;
        }
        return sb.reverse().toString();
    }
    public boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)==s.charAt(j--)) return true;
        }
        return false;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!isPalindrom(convert(n,i))){
                return false;
            }
        }
        return true;
    }
}