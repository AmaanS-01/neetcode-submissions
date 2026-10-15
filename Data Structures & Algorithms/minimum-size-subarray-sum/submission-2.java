class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int i=0;
      int j=1;
      int min=nums.length+1;
      int len=1;
      int sum=nums[i];
      while(j<nums.length||sum>=target){
        if(sum<target){
            sum+=nums[j++];
            len++;
        }
        else{             
            while(sum>=target){
            min=Math.min(len,min);
            sum-=nums[i];
            len--;
            i++;    
            }
        }
      }
      if(min==nums.length+1)return 0;
      return min;  
    }
}