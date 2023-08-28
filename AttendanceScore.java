

	import java.util.Scanner;

	public class AttendanceScore {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int mod = 1000000007;
	        
	        // Create a 2D array to store the number of ways for each day and choice
	        long[][] dp = new long[n + 1][3];
	        
	        // Base case
	        dp[1][0] = dp[1][1] = dp[1][2] = 1;
	        
	        for (int i = 2; i <= n; i++) {
	            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
	            dp[i][1] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
	            dp[i][2] = dp[i - 1][2];
	        }
	        
	        // Calculate the total number of ways
	        long totalWays = (dp[n][0] + dp[n][1] + dp[n][2]) % mod;
	        System.out.println(totalWays);
	    }
	}



