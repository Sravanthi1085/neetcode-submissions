class Solution {
    public static void find(int i,int[]candidates,int target,List<Integer>ds,List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;
            if(candidates[j]>target) break;
            ds.add(candidates[j]);
            find(j+1,candidates,target-candidates[j],ds,res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>res=new ArrayList<>();
        find(0,candidates,target,new ArrayList<>(),res);
        return res;
    
    }
}
