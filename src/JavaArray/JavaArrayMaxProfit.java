package JavaArray;

import java.util.Arrays;

public class JavaArrayMaxProfit {

	public static void main(String[] args) {
		// TODO Max Profit :
		
		//int[] price= {2,2,3,2,5,1};
		int[] price={2,1,2,0,1};
		//int maximumProfit= maxProfit(price);
		int maximumProfit=maxProfitByStocks(price);
		System.out.println(maximumProfit);

	}
	
//	public static int maxProfit(int[] stocks) {
//		 int maxprofit=0;
//	        int profit=0;
//	        
//	        int minBuy=0;
//	        int maxSell=stocks.length- 1;;
//	        int flag=0;
//	        
//	        while(minBuy<maxSell) {
//	        	profit= stocks[maxSell]- stocks[minBuy];
//	        	
//	        	if(profit>maxprofit) maxprofit=profit;
//	        	
//	        	if(stocks[minBuy+1]<stocks[minBuy] ) {
//	        		minBuy +=1;
//	        	    flag++;
//	        	}
//	        	
//	        	
//	        	else if(stocks[maxSell-1]>stocks[maxSell]) {
//	        		maxSell -= 1;
//	        		flag++;
//	        	}
//	        	
//	        	else if(stocks.length==2) return maxprofit;
//	        	
//	        	else
//	        	{
//	        		//need to give condition for iterating ahead even if above  maxSell or minBuy doesnt satisfy.
//	        		//{2,1,2,0,1}   to get the element in mid portion.
//	        		maxSell--;
//	        		
//	        	}
//	        }
//	        if (flag==0 && maxprofit<=0) return 0; 
//	        
//	        
//	        return maxprofit;
//	   }
	
	
	
	public static int maxProfitByStocks(int[] arr) {
		int maxProfit=0;
		int n=arr.length;
		int[] leftBuyMin = new int[n];
		int[] rightSellMax= new int[n];
		
		//for leftBuyMin matrix: we need min value from the left end.
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				leftBuyMin[i]=arr[i];
				min= arr[i];
			}
			
			else leftBuyMin[i]=min;			
		}
		System.out.println(Arrays.toString(leftBuyMin));
		
		//for rightSellMax matrix: we need max value from the right end.
		int max=arr[n-1];
		for(int j=n-1;j>=0;j--) {
			if(arr[j]>max) {
				rightSellMax[j]=arr[j];
				max=arr[j];
			}
			else rightSellMax[j]=max;
		}
		System.out.println(Arrays.toString(rightSellMax));
		
		//For finding the max profit.. 
		//We will iterate over the left and right matrix and find the difference. 
		//Since left matrix contains min value of array in the left and right matrix  contains max value of array in right.
		for(int i=0; i<n;i++) {
			int diff= rightSellMax[i]- leftBuyMin[i];
			if(diff>maxProfit) maxProfit=diff;
		}
		
		return maxProfit;
	}

}
