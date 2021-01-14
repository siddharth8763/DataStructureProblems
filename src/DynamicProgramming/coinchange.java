package DynamicProgramming;

import java.util.Arrays;

public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,6};
		System.out.println(fewestcoins(arr,10));

	}
	/*
	 * Time Complexity O(Amount*number of coins given)
	 * Space Complexity O(Amount)
	 */
	
	
	static int fewestcoins(int coins[],int amount) {
		//Array whose indices contains fewest number of coins required to get 0,1,2....so on 
		int dp[]=new int[amount+1]; // amount +1 since array is 0 based
		Arrays.sort(coins);
		Arrays.fill(dp, amount+1);// initialize to some values other than 0
		dp[0]=0;//fewest number of coin required to get 0
		
		for(int i=0;i<=amount;i++) {//i represents min number of coins required to get i 
			for(int j=0;j<coins.length;j++) { //coins given
				if(coins[j]<=i) {
					dp[i]=Math.min(dp[i], 1+dp[i-coins[j]]); //1 for current coin, minus for remaining amount 
				}
				else {
					break;
				}
			}
		}
		return dp[amount]>amount ? -1 : dp[amount];
	}

}
