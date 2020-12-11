/**
 * @ author  wilbur
 * @ date   2020/12/5 16:14
 *
 * ��дһ�������ҳ��� n ��������
 *�������� ������ ֻ���� 2, 3, 5 ����������
 *
 * ÿ���������� 2,  3��5 ��˵õ�
 * ����3ָ�� ʵ�ֹ鲢����  ѡ����С�ĳ������ӵ�������
 *
 * һ��ʼ������ֻ��{1}��1����ͬ2��3��5��ˣ�ȡ��С��1��2=2���ӵ����������С�
 * ���ڳ�������{1��2}������һ���У�1�Ѿ�ͬ2��˹��ˣ����Խ��û��Ҫ�ٱȽ�1��2�ˣ�����˵1ʧȥ��ͬ2��˵��ʸ�u1++,����ָ����һ������
 *
 */
public class NthUglyNumber264 {
    public int nthUglyNumber(int n) {
        if (n == 0) return 0;
        //��������
        int[] dp = new int[n];
        dp[0] = 1;
        int u1 = 0, u2 = 0, u3 = 0;
        for (int i = 1; i < n; i++) {
            int temp1 = 2 * dp[u1];
            int temp2 = 3 * dp[u2];
            int temp3 = 5 * dp[u3];
            //ѡ����С�ĳ����������ӵ�������
            dp[i] = Math.min(Math.min(temp1, temp2), temp3);
            if (dp[i] == temp1) u1++;
            if (dp[i] == temp2) u2++;
            if (dp[i] == temp3) u3++;
        }
        return dp[n - 1];
    }
}