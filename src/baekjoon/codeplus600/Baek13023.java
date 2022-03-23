package baekjoon.codeplus600;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Baek13023 {
    static int result = 0;

    //ABCDE
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        List<List<Integer>> g = new ArrayList<>();
        //초기화
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            g.get(a).add(b);
            g.get(b).add(a);
        }

        boolean[] chk = new boolean[n];
        for (int i = 0; i < n; i++) {
            dfs(g, chk, i, 1);
            if (result == 1) {
                break;
            }
        }

        bw.write(result + "");
    }

    private void dfs(List<List<Integer>> g, boolean[] chk, int start, int depth) {
        //System.out.println("start : " + start + ", depth : " + depth);
        if (depth == 5) {
            result = 1;
            return;
        }

        chk[start] = true;
        for (int a : g.get(start)) {
            if(!chk[a]) {
                dfs(g, chk, a, depth + 1);
            }
        }
        chk[start] = false;
    }
}
