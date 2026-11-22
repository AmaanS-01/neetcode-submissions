class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans1=-1;
        int ans2=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans1=mid;
                r=mid-1;
            }
            else if(nums[mid]>target)r=mid-1;
            else l=mid+1;
        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans2=mid;
                l=mid+1;
            }
            else if(nums[mid]>target)r=mid-1;
            else l=mid+1;
        }
        return new int[] {ans1,ans2};
    }
}