/**
 * @ author  wilbur
 * @ date   2020/12/15 15:17
 *
 *
 * //给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * //
 * // 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * //
 * // 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 股票问题系列  121    122        123    188  309    714   解题思路整理
 * https://leetcode-cn.com/circle/article/qiAgHn/
 */
public class MaxProfit123 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int L = prices.length;
        int[][][]dp =new int[L][3][2];
        dp[0][1][0]=0;
        dp[0][1][1]=-prices[0];
        dp[0][2][0]=0;
        dp[0][2][1]=-prices[0];
        for (int i = 1; i < L; i++) {
            dp[i][2][0]=Math.max(dp[i-1][2][0],dp[i-1][2][1]+prices[i]);
            dp[i][2][1]=Math.max(dp[i-1][2][1],dp[i-1][1][0]-prices[i]);
            dp[i][1][0]=Math.max(dp[i-1][1][0],dp[i-1][1][1]+prices[i]);
            dp[i][1][1]=Math.max(dp[i-1][1][1],dp[i-1][0][0]-prices[i]);
        }
        return dp[L-1][2][0];
    }
}
