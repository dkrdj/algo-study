package sanghyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P1230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            sb.append('#').append(t).append(" ");
            List<Integer> list = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                switch (st.nextToken()) {
                    case "I":
                        int ix = Integer.parseInt(st.nextToken());
                        int iy = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < iy; j++) {
                            list.add(ix + j, Integer.parseInt(st.nextToken()));
                        }
                        break;
                    case "D":
                        int dx = Integer.parseInt(st.nextToken());
                        int dy = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < dy; j++) {
                            list.remove(dx);
                        }
                        break;
                    case "A":
                        int ay = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < ay; j++) {
                            list.add(Integer.parseInt(st.nextToken()));
                        }
                        break;
                }
            }
            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
