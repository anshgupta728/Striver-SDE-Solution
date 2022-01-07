public class StockBuySell_Day1 {
    static int maxProfit(int prices[]){
        int minPrice=Integer.MAX_VALUE,maxProfit=Integer.MIN_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(prices[i],minPrice);
            profit=prices[i]-minPrice;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
