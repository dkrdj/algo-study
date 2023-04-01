package kyukwan.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P1231 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println(String.format("#%d %s", i, solve(buildTree()))));
    }

    private static String solve(Node[] buildTree) {
        StringBuilder sb = new StringBuilder();
        searchTree(buildTree[1], sb);
        return sb.toString();
    }

    private static void searchTree(Node node, StringBuilder sb) {
        if (node == null) return;
        searchTree(node.left, sb);
        sb.append(node.ch);
        searchTree(node.right, sb);
    }

    private static Node[] buildTree() {
        Node[] tree = new Node[Reader.parseInt() + 1];
        for (int i = 1; i < tree.length; i++) {
            tree[i] = new Node(Reader.parseWord());

            if (i / 2 < 1) continue;

            if (i % 2 == 0) {
                tree[i / 2].left = tree[i];
            } else {
                tree[i / 2].right = tree[i];
            }
        }
        return tree;
    }

    static class Node {
        private String ch;
        private Node left;
        private Node right;

        public Node(String ch) {
            this.ch = ch;
        }
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

        private static String parseWord() {
            try {
                return br.readLine().split(" ")[1];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
