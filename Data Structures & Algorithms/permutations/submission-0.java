class Solution {
    public static void find(int i,int[]nums,List<List<Integer>>res){
        if(i==nums.length){
            List<Integer>ds=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                ds.add(nums[j]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(i,j,nums);
            find(i+1,nums,res);
            swap(i,j,nums);
        }
    }
        private static void swap(int i,int j,int[]nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        find(0,nums,res);
        return res;
    }
}
