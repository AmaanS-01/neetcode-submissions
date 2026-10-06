class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            int l=0;
            int ri=c-1;
            while(l<=ri){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][ri];
                matrix[i][ri]=temp;
                l++;
                ri--;
            }
        }
    }
}
