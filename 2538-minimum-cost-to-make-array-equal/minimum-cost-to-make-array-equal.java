
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) arr[i] = new long[]{nums[i], cost[i]};
        Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));

        long total = 0, median = 0;
        for (long[] a : arr) total += a[1];
        for (long sum = 0, i = 0; i < n; i++) {
            sum += arr[(int)i][1];
            if (sum * 2 >= total) { median = arr[(int)i][0]; break; }
        }

        long ans = 0;
        for (long[] a : arr) ans += Math.abs(a[0] - median) * a[1];
        return ans;
    }
}
