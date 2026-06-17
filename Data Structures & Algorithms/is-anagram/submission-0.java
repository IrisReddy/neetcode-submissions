class Solution {
    public boolean isAnagram(String s, String t) {
        char l1[]=s.toCharArray();
        char l2[]=t.toCharArray();
        Arrays.sort(l1);
        Arrays.sort(l2);
        return Arrays.equals(l1,l2);
    }
}
