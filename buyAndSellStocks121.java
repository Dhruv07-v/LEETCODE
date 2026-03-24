class buyAndSellStocks121{
    public static void main(String[] args) {
        int price[] = {7,1,5,6,4,3};
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0 ;i<prices.length;i++){
            if(buy<prices[i]){
                int profit = prices[i] - buy;
                max = Math.max(profit, max);

            }else{
                buy = prices[i];
            }
        }
        return max;
    }
}