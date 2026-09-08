class Solution {
    public int[] sortArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        int[] count=new int[max-min+1];
        for(int n:nums){
            count[n-min]++;
        }
        int[] arr=new int[nums.length];
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k]=i+min;
                k++;
            }
        }
    return arr;
    }
}