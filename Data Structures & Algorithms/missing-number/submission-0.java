class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=nums[i];
        }
        return sum-res;
    }
}
