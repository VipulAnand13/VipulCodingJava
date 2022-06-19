package JavaArray;

import java.util.Arrays;

public class JavaArrayMaxProfitStocks2 {
 
	public static void main(String[] args) {
		/*
		 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
			On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
			However, you can buy it then immediately sell it on the same day.
			Find and return the maximum profit you can achieve.
			
			Input: prices = [7,1,5,3,6,4]
			Output: 7
			Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
			Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
			Total profit is 4 + 3 = 7.
			
			Input: prices = [7,6,4,3,1]
			Output: 0
			Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
		 */
//		int[] prices = {2,1,2,0,1};
	//  int[] prices = {1,1,0};
	//	int[] prices= {2,2,5};
	//	int[] prices= {2,5,5};
		int[] prices= {7,1,5,3,6,4};
		
		System.out.println(maxProfitStocks(prices));

	}
     
		
	static int maxProfitStocks(int[] prices) {
		 int maxProfit=0;
			int tempMin=0;
			int tempMax=0;
	        int n=prices.length;
			if(n==1) return maxProfit;
	            
			for(int j=0;j<n;j++) {
				if(j==0) {
					if(prices[1]>prices[0])
					tempMin=prices[0];
				}
				
				else if(j==n-1) {
					if(prices[n-1]>prices[n-2])
					tempMax=prices[n-1];
				}
				
				else if(prices[j]<=prices[j-1] && prices[j]<prices[j+1]) tempMin=prices[j];
							
				else if(prices[j]>prices[j-1] && prices[j]>= prices[j+1]) tempMax=prices[j];				
				      
				if(tempMax>0 && tempMin>=0) {
					maxProfit += tempMax - tempMin;			
				     tempMin=0;
				     tempMax=0;}
			}
			
			return maxProfit;
	}
}
