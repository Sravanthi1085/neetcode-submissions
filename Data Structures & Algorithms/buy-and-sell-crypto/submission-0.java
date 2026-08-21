class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=nums[j]-nums[i];
                max=Math.max(max,profit);
            }
        }
        return max;
    }
}
