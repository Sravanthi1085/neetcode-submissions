class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target && target<=matrix[i][n-1])
            return binarySearch(matrix[i],target);
        }
        return false;
    }
    private boolean binarySearch(int[] matrix,int target){
        int l=0;
        int h=matrix.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(matrix[m]==target){
                return true;
            }
            if(matrix[m]<target){
                l=m+1;

            }
            else {
                h=m-1;
            }
        }
        return false;
    }
}
