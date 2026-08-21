class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       HashSet<Character>seen=new HashSet<>();
       int l=0;
       int r=0;
       int max=0;
       while(r<n){
        char ch=s.charAt(r);
        while(seen.contains(ch)){
            seen.remove(s.charAt(l));
            l++;
        }
        seen.add(ch);
        max=Math.max(max,r-l+1);
       r++;
       } 
       return max;
    }
}
