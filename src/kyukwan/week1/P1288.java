package kyukwan.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1288 {

    public static void main(String[] args) throws IOException {
        IntStream.range(0, Reader.parseInt())
                .forEach(i -> System.out.println(String.format("#%d %d", i + 1, solve(Reader.parseInt()))));
    }

    private static int solve(int input) {
        Set<Character> digits = "0123456789".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        int num = 0;
        while (!digits.isEmpty()) {
            num += input;
            for (var c : Integer.toString(num).toCharArray()) {
                digits.remove(c);
            }
        }
        return num;
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

