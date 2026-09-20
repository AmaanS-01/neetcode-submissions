class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int size=Integer.MIN_VALUE;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int len=j-i;
            size=Math.max(size,height*len);
            if(heights[i]<heights[j]){
                i++;
            }
            else j--;
        }
        return size;
    }
}
