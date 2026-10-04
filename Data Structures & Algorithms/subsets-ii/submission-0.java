class Solution {
    public static void find(int i,int[]nums,List<Integer>ds, List<List<Integer>>res){
            res.add(new ArrayList<>(ds));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            ds.add(nums[j]);
            find(j+1,nums,ds,res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        find(0,nums,new ArrayList<>(),res);
        return res;
    }
}
