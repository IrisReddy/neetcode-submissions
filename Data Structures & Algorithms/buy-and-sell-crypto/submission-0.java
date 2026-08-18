class Solution {
    public int maxProfit(int[] prices) {
        int m = 0, min = prices[0];
        for(int p : prices) {
            m = Math.max(m, p - min);
            min = Math.min(min , p);
        }
        return m;
    }
}
