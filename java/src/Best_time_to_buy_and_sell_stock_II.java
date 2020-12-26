public class Best_time_to_buy_and_sell_stock_II {
    public int maxProfit(int[] prices){
        if(prices.length < 2){
            return 0;
        }
        int sum = 0, i = 0, j = 1;
        while(i < prices.length && j < prices.length){
            if(prices[i] > prices[j]){
                i++;
                j++;
            }
            else{
                sum += prices[j] - prices[i];
                i++;
                j++;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int nums1[] = {7, 1, 5, 3, 6, 4};
        int nums2[] = {1, 2, 3, 4, 5};
        int nums3[] = {7, 6, 4, 3, 1};

        Best_time_to_buy_and_sell_stock_II s = new Best_time_to_buy_and_sell_stock_II();

        System.out.println(s.maxProfit(nums1));
        System.out.println(s.maxProfit(nums2));
        System.out.println(s.maxProfit(nums3));
    }
}
