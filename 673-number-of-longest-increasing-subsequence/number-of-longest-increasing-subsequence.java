class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        
        int[] dp = new int[n];     // length of LIS
        int[] count = new int[n];  // number of LIS

        int maxLen = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;
            count[i] = 1;

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {

                    // longer subsequence found
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }

                    // same length subsequence found
                    else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }

            // update answer
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                ans = count[i];
            } 
            else if (dp[i] == maxLen) {
                ans += count[i];
            }
        }

        return ans;
    }
}