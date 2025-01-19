public class BuyAndSellStockTwo{
    
    //  Buy and Sell Stock 2: multiple times buy and sell stock to gain max profit.
    // STEPS:
    // Iterate i from 1 and then check if i > i-1, if yes then add a[i]-a[i-1] to profit and continue the loop till the end of the array, if not then return profit. 
    public static int maxProfit(int[] prices)
    {

        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
    
    public static void main(String[] args) 
    {
        int[] arr={5,2,6,1,4,7,3,6};
        System.out.println("The maximum profit is: "+ maxProfit(arr));    
    }
}