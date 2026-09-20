class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
       int expected =1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<0)continue;
        else {
            if(nums[i]==expected)expected+=1;
        }
       }
       return expected;
    }
}