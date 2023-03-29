package kyukwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1230 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println(String.format("#%d %s", i, solve(getIntegers(), getCommands()))));
    }

    private static String solve(String[] ciphertext, String[] commands) {
        List<String> ciphertexts = Arrays.stream(ciphertext)
                .collect(Collectors.toCollection(LinkedList::new));

        for (String command : commands) {
            String[] str = command.split(" ");
            if (str[0].equals("I")) {
                int index = Integer.parseInt(str[1]);
                int count = Integer.parseInt(str[2]);
                for (int i = 0; i < count; i++) {
                    ciphertexts.add(index + i, str[3 + i]);
                }
            } else if (str[0].equals("D")) {
                int index = Integer.parseInt(str[1]);
                int count = Integer.parseInt(str[2]);
                for (int i = 0; i < count; i++) {
                    ciphertexts.remove(index);
                }
            } else if (str[0].equals("A")) {
                int count = Integer.parseInt(str[1]);
                for (int i = 0; i < count; i++) {
                    ciphertexts.add(str[2 + i]);
                }
            }
        }
        return ciphertexts.stream()
                .limit(10)
                .collect(Collectors.joining(" "));
    }

    private static String[] getIntegers() {
        int ciphertextCount = Reader.parseInt();
        String[] text = new String[ciphertextCount];
        for (int i = 0; i < ciphertextCount; i++) {
            text[i] = Reader.next();
        }
        return text;
    }

    private static String[] getCommands() {
        int commandCount = Reader.parseInt();
        String[] commands = new String[commandCount];
        String text = Reader.readLine();
        int cnt = 0;
        int start = 0;
        for (int scan = 1; scan < text.length(); scan++) {
            if ((text.charAt(scan) != 'I') && (text.charAt(scan) != 'D') && (text.charAt(scan) != 'A')) {
                continue;
            }
            commands[cnt++] = text.substring(start, scan - 1);
            start = scan;
        }
        commands[cnt] = text.substring(start);
        return commands;
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

        private static String readLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static int parseInt() {
            return Integer.parseInt(next());
        }
    }
}
