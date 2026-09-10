class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int n=piles.length;
       int l=1;
       int high=maxElement(piles);
       int ans=high;
       while(l<=high){
        int m=(l+high)/2;
        long totalhours=totalHours(piles,m);
        if(totalhours<=h){
            ans=m;
            high=m-1;
        }
        else{
            l=m+1;
        }
       }
       return ans;

    }
    private int maxElement(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
    private long totalHours(int[]piles,int m){
        long totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+= Math.ceil((double) piles[i]/m);
        }
        return totalhours;
    }

}
