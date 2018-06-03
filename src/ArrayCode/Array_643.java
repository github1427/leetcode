package ArrayCode;

/**
 * 子数组最大平均数I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 */
public class Array_643 {
    public static void main(String[] args) {
        int [] nums={5};
        System.out.println(findMaxAverage(nums,1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        double maxAverage;
        for (int i=0;i<len;i++){
            sum+=nums[i];
            if (i>=k-1){
                maxSum=Math.max(maxSum,sum);
                sum-=nums[i-k+1];
            }
        }
        maxAverage=(double) maxSum/k;
        return maxAverage;
    }
}
