class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char arr[]=s.toCharArray();
        char array[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(array);
        return Arrays.equals(arr,array);
    }
}
