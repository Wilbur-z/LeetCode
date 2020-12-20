/**
 * @ author  wilbur
 * @ date   2020/12/20 21:30
 *
 *
 * //F(0) = 0, F(1)= 1
 * //F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * //
 * // 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * //
 * // 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class Fib10 {
    public int fib(int n) {
        if(n == 0) return 0;
        int []dp =new  int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            dp[i] %= 1000000007;// 每次运算都取模 避免越界
        }
        return dp[n];
    }
}
