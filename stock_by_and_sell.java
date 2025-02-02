/*Suppose you have been keeping an eye on the stock market for a while, and you have been tracking the daily prices of a particular stock. You want to make a profit by buying and selling the stock at the right time.
Given the array of prices of the stock on each day, you need to figure out the best strategy to maximize your profit.
However, if the stock prices are constantly decreasing, there is no way for you to make a profit. */

import java.util.*;
public class stock_by_and_sell {
	static int maxProfit(int prices[], int size)
	{
		int maxProfit = 0;
		for (int i = 1; i < size; i++)
			if (prices[i] > prices[i - 1])
				maxProfit += prices[i] - prices[i - 1];
		return maxProfit;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[] = new int[n];
        for(int i=0;i<n;i++)
        {
            price[i]=sc.nextInt();
        }
		System.out.println(maxProfit(price, n));
	}
}
/*
 *   OUTPUT 1 : 
7
100 180 260 310 40 535 695 
865

*  OUTPUT 2 : 
5
4 2 2 2 4
2

*  OUTPUT 3 :
5   
10 8 6 4 2
0
 */