class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int l=0;
      int r=nums.length-1;
      while(l<r){
        while(nums[l]%2==0&&l<r)l++;
        while(nums[r]%2!=0&&l<r)r--;
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
      }
      return nums;  
    }
}