public class SellBuyStock {
    public static  int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        int buyPrice = prices[0];
        int sellPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;

                    buyPrice = minPrice;
                    sellPrice = prices[i];
                }
            }
        }
        System.out.println("Buy Price  = " + buyPrice);
        System.out.println("Sell Price = " + sellPrice);

        return maxProfit;
    }
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println("Maximum Profit = " + result);

    }
}
