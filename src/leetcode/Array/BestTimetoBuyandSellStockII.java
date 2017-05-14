package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length<0) return 0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}