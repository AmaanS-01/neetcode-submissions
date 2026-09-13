class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int[] left=new int[n];
      int[] right=new int[n];
      int[] arr=new int[n];
      int prod=1;
      left[0]=1;
      right[n-1]=1;
      for(int i=1;i<n;i++){
            prod*=nums[i-1];
            left[i]=prod;
      }
      prod=1;
       for(int i=n-2;i>=0;i--){
            prod*=nums[i+1];
            right[i]=prod;
      }
      for(int i=0;i<n;i++){
        arr[i]=left[i]*right[i];
      }

      return arr;  
    }
}