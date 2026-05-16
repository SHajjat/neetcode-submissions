class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> list = new ArrayList<>();
            if(strs[i].equals("@@")){
                continue;
            }
            list.add(strs[i]);
            for (int j = i+1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    list.add(strs[j]);
                    strs[j]= "@@";
                }
            }
            result.add(list);
        }
        return result;
    }

    private static boolean isAnagram(String base, String compare) {
        if (base.length() != compare.length()) {
            return false;
        }
        Map<String, Integer> baseMap = new HashMap<>();
        Map<String, Integer> CompareMap = new HashMap<>();
        for (int i = 0; i < base.length(); i++) {
            String baseC = ""+base.charAt(i);
            String compareC = ""+compare.charAt(i);
            baseMap.put(baseC, baseMap.getOrDefault(baseC,0)+1);
            CompareMap.put(compareC, CompareMap.getOrDefault(compareC,0)+1);
        }

        return baseMap.equals(CompareMap);
    }
}
