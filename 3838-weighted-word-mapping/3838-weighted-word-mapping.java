class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        HashMap<Character, Integer> m = new HashMap<>();
        String s = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 26; i++) {
            m.put(s.charAt(i), weights[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (char w : words[i].toCharArray()) {
                sum += m.get(w);
            }
            int a = sum % 26;
            char mc = (char) ('z' - a);
            sb.append(mc);
            }
        return sb.toString();

        }

    }
