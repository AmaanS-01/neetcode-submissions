class Solution {
    public int singleNonDuplicate(int[] nums) {
      int l=0;
      int r=1;
      while(r<nums.length){
        if(nums[l]!=nums[r])return nums[l];
        else{
            l+=2;
            r+=2;
        }
      }
      return nums[l];  
    }
}