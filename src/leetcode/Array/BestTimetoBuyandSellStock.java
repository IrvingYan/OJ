package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock time = new BestTimetoBuyandSellStock();
        int[] arr = {7,6,4,3,1};
        System.out.print(time.maxProfit(arr));
    }
    public int maxProfit(int[] prices) {
        int maxCur = 0;
        int maxSoFar = 0;
        for(int i=1;i<prices.length;i++) {
            maxCur = Math.max(0,maxCur += prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxCur,maxSoFar);
        }
        return maxSoFar;
    }
}
