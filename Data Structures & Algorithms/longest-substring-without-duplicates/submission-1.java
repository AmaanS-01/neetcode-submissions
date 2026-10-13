class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> hset=new HashSet<>();
      int n=s.length();
      int max=0;
      int j=0;
      for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(hset.contains(ch)){
            while(hset.contains(ch))hset.remove(s.charAt(j++));
        }
            hset.add(ch);
        max=Math.max(max,i-j+1);
      } 
      return max;
    }
}
