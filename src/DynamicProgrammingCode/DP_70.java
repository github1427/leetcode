package DynamicProgrammingCode;

/**
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 步 + 1 步
 * 2.  2 步
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 步 + 1 步 + 1 步
 * 2.  1 步 + 2 步
 * 3.  2 步 + 1 步
 */
public class DP_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n){
        if (n<3){
            return n;
        }
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
