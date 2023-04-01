package kyukwan.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P10726 {

    public static void main(String[] args) throws IOException {
        IntStream.range(0, Reader.parseInt())
                .forEach(i -> System.out.println(String.format("#%d %s", i + 1, solve(Reader.parseInt(), Reader.parseInt()) ? "ON" : "OFF")));
    }

    private static boolean solve(int n, int m) {
        int bitmask = (1 << n) - 1;
        return (m & bitmask) == bitmask;
    }

    private static class Reader {
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
