class Solution {
    public static void find(int i,int[]nums,int target,List<Integer>ds,List<List<Integer>>res){
        if(i==nums.length){
        if(target==0){
            res.add(new ArrayList<>(ds));
        }
            return;
    
        }
        if(nums[i]<=target){
            ds.add(nums[i]);
            find(i,nums,target-nums[i],ds,res);
            ds.remove(ds.size()-1);
        }
            find(i+1,nums,target,ds,res);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>res=new ArrayList<>();
        find(0,nums,target,new ArrayList<>(),res);
        return res;
    }
}
