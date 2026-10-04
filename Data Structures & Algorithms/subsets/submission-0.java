class Solution {
    public static void find(int i,int[]nums,List<Integer>ds,List<List<Integer>>res){
        if(i==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
       
            ds.add(nums[i]);
            find(i+1,nums,ds,res);
            ds.remove(ds.size()-1);
             find(i+1,nums,ds,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        find(0,nums,new ArrayList<>(),res);
        return res;
    }
}
