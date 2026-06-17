class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int c = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), c+1);
            }
            else    sMap.put(s.charAt(i), 1);
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                int c = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), c+1);
            }
            else    tMap.put(t.charAt(i), 1);
        }
        System.out.println(sMap);
        System.out.println(tMap);
        if(sMap.equals(tMap))   return true;
        else    return false;
    }
}
