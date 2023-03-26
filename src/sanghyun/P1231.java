package sanghyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            sb.append('#').append(t).append(" ");
            int n = Integer.parseInt(br.readLine());
            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int idx = Integer.parseInt(st.nextToken());
                Node curNode = nodes[idx];
                curNode.value = st.nextToken().charAt(0);
                if (st.hasMoreTokens()) {
                    int left = Integer.parseInt(st.nextToken());
                    curNode.left = nodes[left];
                }
                if (st.hasMoreTokens()) {
                    int right = Integer.parseInt(st.nextToken());
                    curNode.right = nodes[right];
                }
            }
            inOrder(sb, nodes[1]);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void inOrder(StringBuilder sb, Node curNode) {
        if (curNode.left != null) {
            inOrder(sb, curNode.left);
        }
        sb.append(curNode.value);
        if (curNode.right != null) {
            inOrder(sb, curNode.right);
        }
    }

    private static class Node {
        char value;
        Node left;
        Node right;

        public Node() {
        }

    }
}


