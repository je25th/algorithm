package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek2225 {
    static final long mod = 1000000000L;

    //합분해
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        long[][] mem = new long[N + 1][K + 1];
        mem[0][0] = 1;
        for (int n = 0; n <= N; n++) {
            for (int k = 1; k <= K; k++) {
                for (int i = 0; i <= n; i++) {
                    mem[n][k] += mem[n-i][k-1];
                    mem[n][k] %= mod;
                }
            }
        }

        bw.write(mem[N][K] + "");
    }
}
