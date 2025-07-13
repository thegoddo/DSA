package DP;

public class ClimbingStairs {
    public int climbingStairs(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        System.out.println("Climbing Stairs - Tabulation DP: ");
        int[] testCases = { 1, 2, 3, 4, 5, 10, 20, 30, 45 };

        for (int i : testCases) {
            System.out.println("Ways to climb " + i + " stairs: " + climbingStairs.climbingStairs(i));
        }
    }
}
