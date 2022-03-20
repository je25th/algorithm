package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek2193 {

    static final int limit = 90;

    //이친수
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int input = Integer.parseInt(br.readLine());

        long[][] mem = new long[limit + 1][2];
        mem[1][0] = 0;
        mem[1][1] = 1;
        for (int n = 2; n <= input; n++) {
            mem[n][0] = mem[n-1][0] + mem[n-1][1];
            mem[n][1] = mem[n-1][0];
        }

        bw.write((mem[input][0] + mem[input][1]) + "");
    }
}
