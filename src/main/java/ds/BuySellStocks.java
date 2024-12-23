package ds;

import java.util.Arrays;
import java.util.LinkedList;

public class BuySellStocks {

    public static void main(String[] args) {
        BuySellStocks buySellStocks = new BuySellStocks();
        LinkedList<int[]> testCases = new LinkedList<>();
        testCases.add(new int[]{7, 1, 5, 3, 6, 4}); //5
        testCases.add(new int[]{7, 6, 4, 3, 1}); //0
        testCases.add(new int[]{3, 8, 6, 7, 2}); //5
        testCases.add(new int[]{1, 2, 3, 4, 5}); //4
        testCases.add(new int[]{5, 4, 3, 2, 10}); //8


        // Automated validation
        for (int[] testCase : testCases) {
            int maxProfit = buySellStocks.maxProfit(testCase);
            System.out.printf("Stock Prices: %s, Max Profit: %d%n", Arrays.toString(testCase), maxProfit);
        }
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProft = Integer.MIN_VALUE;

        for (int currentPrice : prices) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice; // Set min currentPrice if today's currentPrice is lower than prior min
            }
            if (currentPrice - minPrice > maxProft) {
                maxProft = currentPrice - minPrice; //Set max profit is current price - min price is greater than prior max
            }
        }
        return maxProft;
    }
}
