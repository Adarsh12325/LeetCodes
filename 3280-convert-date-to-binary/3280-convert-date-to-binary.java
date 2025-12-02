class Solution {
    public String convertDateToBinary(String date) {
        String[] a = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length;i++){
            int x = Integer.parseInt(a[i]);
            sb.append(Integer.toBinaryString(x));
            if(i!=a.length-1) sb.append("-");
        }
        return sb.toString();
    }
}