class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();
        List<Integer>[] aList = new List[nums.length + 1];
        for(int i = 0; i <= nums.length; i++)
            aList[i] = new ArrayList<>();
        for(int n : nums)
            hMap.put(n, hMap.getOrDefault(n, 0) + 1);
        for(Map.Entry<Integer,Integer> e : hMap.entrySet())
            aList[e.getValue()].add(e.getKey());
        int res[] = new int[k];
        int f = 0;
        for(int i = aList.length - 1; i > 0 && f < k; i--)
            for(int n : aList[i]) {
                res[f++] = n;
                if(f == k)  return res;
            }
        return res;
    }
}
