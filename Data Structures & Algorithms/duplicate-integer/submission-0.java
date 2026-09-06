class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> hmp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hmp.put(nums[i],hmp.getOrDefault(nums[i],0)+1);
       } 
       for(int n:hmp.values()){
        if(n>1)return true;
       }
       return false;
    }
}