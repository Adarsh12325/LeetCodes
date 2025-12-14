class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> m = new HashMap<>();
        m.put("electronics",0);
        m.put("grocery",1);
        m.put("pharmacy",2);
        m.put("restaurant",3);
        List<String[]> l = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(code[i]==null || code[i].isEmpty()) continue;
            if(!code[i].matches("[A-Za-z0-9_]+")) continue;
            if(!isActive[i]) continue;
            if(!m.containsKey(businessLine[i])) continue;
            l.add(new String[]{businessLine[i],code[i]});
        }
        Collections.sort(l, (a,b)->{
            int cmp = m.get(a[0])-m.get(b[0]);
            if(cmp!=0){
                return cmp;
            }
            return a[1].compareTo(b[1]);
        });
        for(String[] x: l){
            result.add(x[1]);
        }
        return result;
    }
}