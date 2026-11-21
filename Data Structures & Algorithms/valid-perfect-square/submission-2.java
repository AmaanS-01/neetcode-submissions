class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
      int l=0;
      int r=num-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        long sqr=(long)mid*mid;
        if(sqr==num)return true;
        else if(sqr>num)r=mid-1;
        else l=mid+1; 
      }
      return false;  
    }
}