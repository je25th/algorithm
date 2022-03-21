package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek1699 {

    //제곱수의 합
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int num = Integer.parseInt(br.readLine());

        int[] mem = new int[num + 1];
        for (int n = 1; n <= num; n++) {
            mem[n] = n;
            for (int i = 1; i*i <= n; i++) {
                mem[n] = Math.min(mem[n],(mem[n-i*i]+1));
            }
        }

        bw.write(mem[num] + "");
    }
}
