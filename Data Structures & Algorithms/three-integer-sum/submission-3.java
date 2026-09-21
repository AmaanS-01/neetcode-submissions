class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    lst.add(temp);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1])j++;
                while(j<k&&nums[k]==nums[k+1])k--; 
                }
                else if(nums[i]+nums[j]+nums[k]>0)k--;
                else j++;  
                  
                       }
                
        }
        return lst;
    }
}
