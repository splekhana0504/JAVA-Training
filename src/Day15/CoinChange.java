package Day15;

import java.util.Arrays;

public class CoinChange {
    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] =Math.min(dp[i],1+dp[i - coin]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        if (result == -1) {
            System.out.println("No solution");
        }else{
            System.out.println("Minimum Coins needed:"+result);
        }
    }
}