class Solution {
    public int findMin(int[] nums) {
       int min=0;
       int l=0;
       int r=nums.length-1;
       if(nums[l]<nums[r])min=nums[l];
       else min=nums[r];
       while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]<min)min=nums[mid];
        if(nums[l]<nums[mid]){
            if(min>nums[l])min=nums[l];
            else l=mid+1;
        }
        else{
            if(min>nums[r])min=nums[r];
            else r=mid-1;
        }
       }
       return min;
    }
}
