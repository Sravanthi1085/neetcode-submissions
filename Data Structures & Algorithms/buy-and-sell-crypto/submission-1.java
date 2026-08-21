class Solution {
    public int maxProfit(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int max=0;
        for(int pri:nums){
            mini=Math.min(mini,pri);
            int pro=pri-mini;
                max=Math.max(max,pro);
            
        }
        return max;
    }
}
