class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] left=new int[nums.length];
      int[] right=new int[nums.length];
      int[] arr=new int[nums.length];
      int prod=1;
      for(int i=0;i<nums.length;i++){
        if(i==0){
            left[i]=prod;
        }
        else{
            prod*=nums[i-1];
            left[i]=prod;
        }
      }
      prod=1;
       for(int i=nums.length-1;i>=0;i--){
        if(i==nums.length-1){
            right[i]=prod;
        }
        else{
            prod*=nums[i+1];
            right[i]=prod;
        }
      }
      for(int i=0;i<nums.length;i++){
        arr[i]=left[i]*right[i];
      }

      return arr;  
    }
}