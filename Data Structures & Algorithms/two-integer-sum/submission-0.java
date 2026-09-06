class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer>hmp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hmp.containsKey(diff)){
                arr[0]=hmp.get(diff);
                arr[1]=i;
            }
            else{
                hmp.put(nums[i],i);
            }
        }
        return arr;
    }
}
