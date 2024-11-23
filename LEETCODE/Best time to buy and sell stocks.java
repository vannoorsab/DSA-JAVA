//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int a=Integer.MAX_VALUE;
        int time=0;
        for(int price:prices){
            a=Math.min(a,price);
            time=Math.max(time , price-a );
        }
       return time;
    }
}