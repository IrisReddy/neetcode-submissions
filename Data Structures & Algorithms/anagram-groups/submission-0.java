class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> gMap = new HashMap<>();
        for(String s : strs){
            int c[] = new int[26];
            for(char ch : s.toCharArray()) 
                c[ch - 'a']++;
        String k = Arrays.toString(c);
        gMap.putIfAbsent(k,new ArrayList<>());
        gMap.get(k).add(s);
        }
        return new ArrayList<>(gMap.values());
    }
}
