class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<String, Integer> sMap = new HashMap<>();
        HashMap<String, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
           String sChar = ""+s.charAt(i);
           String tChar = ""+t.charAt(i);

           sMap.put(sChar,sMap.getOrDefault(sChar,0)+1);
           tMap.put(tChar,tMap.getOrDefault(tChar,0)+1);
        }

        return sMap.equals(tMap);
    }
}
