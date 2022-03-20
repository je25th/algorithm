package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek10844 {

    static final int limit = 100;
    static final long mod = 1000000000L;

    //쉬운 계단 수
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int input = Integer.parseInt(br.readLine());

        long[][] mem = new long[limit + 1][10];
        mem[1][0] = 0;
        for (int i = 1; i <= 9; i++) {
            mem[1][i] = 1;
        }
        for (int n = 2; n <= input; n++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    mem[n][i] = mem[n-1][i+1];
                } else if (i == 9) {
                    mem[n][i] = mem[n-1][i-1];
                } else {
                    mem[n][i] = mem[n-1][i+1] + mem[n-1][i-1];
                }
                mem[n][i] %= mod;
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += mem[input][i];
        }
        result %= mod;
        bw.write(result + "");

    }
}
