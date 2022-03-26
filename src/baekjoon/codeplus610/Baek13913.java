package baekjoon.codeplus610;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Baek13913 {
    static final int MAX = 100002;

    //숨바꼭질
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        boolean[] chk = new boolean[MAX];
        int[] dist = new int[MAX];
        int[] from = new int[MAX];

        chk[n] = true;
        dist[n] = 0;
        from[n] = -1;

        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        while(!q.isEmpty()){
            int now = q.remove();
            //System.out.println(now);
            if (now - 1 >= 0 && chk[now - 1] == false) {
                q.add(now - 1);
                chk[now - 1] = true;
                dist[now - 1] = dist[now] + 1;
                from[now - 1] = now;
            }

            if (now + 1 < MAX && chk[now + 1] == false) {
                q.add(now + 1);
                chk[now + 1] = true;
                dist[now + 1] = dist[now] + 1;
                from[now + 1] = now;
            }

            if (now * 2 < MAX && chk[now * 2] == false) {
                q.add(now * 2);
                chk[now * 2] = true;
                dist[now * 2] = dist[now] + 1;
                from[now * 2] = now;
            }
        }

        bw.write(dist[k] + "\n");
        printRoute(bw, from, n, k);
    }

    private void printRoute(BufferedWriter bw, int[] from, int n, int k) throws IOException {
        if(from[k] != n && from[k] != -1) {
            printRoute(bw, from, n, from[k]);
        }
        if(from[k] == n) {
            bw.write(from[k] + " ");
        }
        bw.write(k + " ");
    }
}
