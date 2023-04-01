package sanghyun.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append(" ");
            String str = br.readLine();
            int n = str.length();
            long[][] dp = new long[n + 1][1 << 4];
            dp[0][1] = 1;
            for (int i = 1; i <= n; i++) {
                int r = str.charAt(i - 1) - 'A';
                for (int j = 1; j < (1 << 4); j++) {
                    if ((j & (1 << r)) != 0) {
                        for (int k = 1; k < (1 << 4); k++) {
                            if ((k & j) != 0)
                                dp[i][j] += dp[i - 1][k];
                        }
                        dp[i][j] %= 1000000007;
                    }
                }
            }
            long sum = 0;
            for (long a : dp[n]) {
                sum += a;
            }
            sb.append(sum % 1000000007).append("\n");
        }
        System.out.println(sb);
    }
}