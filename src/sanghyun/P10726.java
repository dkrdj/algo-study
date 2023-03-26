package sanghyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String binaryString = Integer.toBinaryString(m);
            int size = binaryString.length() - n;
            if (size < 0) {
                sb.append("OFF\n");
                continue;
            }
            char[] bin = binaryString.substring(size).toCharArray();
            for (char c : bin) {
                if (c != '1') {
                    sb.append("OFF\n");
                }
            }
            sb.append("ON\n");
        }
        System.out.println(sb);
    }
}