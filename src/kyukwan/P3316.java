package kyukwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P3316 {

    public static void main(String[] args) {
        IntStream.range(0, Reader.parseInt()).forEach(i ->
                System.out.println(String.format("#%d %d", i + 1, solve(Reader.next())))
        );
    }

    private static int solve(String next) {
        char[] managers = next.toCharArray();

        int[][] memoization = new int[managers.length][16];
        for (int i = 0; i < 16; i++) {
            memoization[0][getBit('A') | getBit(managers[0]) | i] = 1;
        }

        for (int i = 1; i < managers.length; i++) {
            for (int cur = 0; cur < 16; cur++) {
                if ((getBit(managers[i]) & cur) == 0) continue;

                for (int prev = 0; prev < 16; prev++) {
                    if (memoization[i - 1][prev] == 0) continue;
                    if ((prev & cur) == 0) continue;

                    memoization[i][cur] = (memoization[i][cur] + memoization[i - 1][prev]) % 1000000007;
                }
            }
        }

        int result = 0;
        for (int num : memoization[managers.length - 1]) {
            result = (result + num) % 1000000007;
        }
        return result;
    }

    private static int getBit(char a) {
        return 1 << a - 'A';
    }

    static class Reader {
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private static StringTokenizer st;

        private static String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        private static int parseInt() {
            return Integer.parseInt(next());
        }

    }
}
