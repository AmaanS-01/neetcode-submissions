class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        int count=0;
        for(int num:nums){
            hset.add(num);
        }
        for(int num:hset){
            if(!hset.contains(num-1)){
                int cur=num;
                int len=0;
                while(hset.contains(cur)){
                    len++;
                    cur++;
                }
                count=Math.max(count,len);
            }
            
        }
        return count;
    }
}
