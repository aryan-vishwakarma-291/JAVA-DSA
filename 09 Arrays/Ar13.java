public class Ar13 {

    public static int buyAndSellStocks(int prices[]) {
        int buyingP = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buyingP < prices[i]) {
                int profit = prices[i] - buyingP;
                maxprofit = Math.max(maxprofit,profit);
            }
            else {
                buyingP = prices[i];
            }
        }
        return maxprofit;
    }
   public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
   } 
}
