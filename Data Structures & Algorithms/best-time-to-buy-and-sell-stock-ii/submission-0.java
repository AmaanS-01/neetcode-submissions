class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int buy=0;
        int sell=1;
        while(sell<prices.length){
            if(prices[sell]-prices[buy]<=0){
                buy=sell;
                sell++;
            }
            else{
                sum+=prices[sell]-prices[buy];
                buy=sell;
                sell++;
            }
        }
        return sum;
    }
}