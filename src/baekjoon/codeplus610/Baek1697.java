package baekjoon.codeplus610;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baek1697 {
    static final int MAX = 100002;

    //숨바꼭질
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        boolean[] chk = new boolean[MAX];
        int[] dist = new int[MAX];

        chk[n] = true;
        dist[n] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        while(!q.isEmpty()){
            int now = q.remove();
            //System.out.println(now);
            if (now - 1 >= 0 && chk[now - 1] == false) {
                q.add(now - 1);
                chk[now - 1] = true;
                dist[now - 1] = dist[now] + 1;
            }

            if (now + 1 < MAX && chk[now + 1] == false) {
                q.add(now + 1);
                chk[now + 1] = true;
                dist[now + 1] = dist[now] + 1;
            }

            if (now * 2 < MAX && chk[now * 2] == false) {
                q.add(now * 2);
                chk[now * 2] = true;
                dist[now * 2] = dist[now] + 1;
            }
        }

        bw.write(dist[k] + "");
    }
}
