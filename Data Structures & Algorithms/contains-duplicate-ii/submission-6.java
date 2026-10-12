class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)return false;
        HashSet<Integer> hset=new HashSet<>();
        int i=0;
        while((i<nums.length)&&(i<=k)){
            if(hset.contains(nums[i]))return true;
            else{
                hset.add(nums[i]);
            }
            i++;
        }
        int j=0;
        for( i=k+1;i<nums.length;i++){
            hset.remove(nums[j++]);
            if(hset.contains(nums[i]))return true;
            else hset.add(nums[i]);
        }
        return false;
    }
}