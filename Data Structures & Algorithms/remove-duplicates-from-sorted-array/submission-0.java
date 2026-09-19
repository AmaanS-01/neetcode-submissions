class Solution {
    public int removeDuplicates(int[] nums) {
        int I=0;
        int i=0;
        while(i<nums.length){
            if(nums[I]==nums[i])i++;
            else{
                nums[++I]=nums[i];
                i++;
            }
        }
        return I+1;
    }
}