package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek11727 {

    //2×n 타일링 2
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int num = Integer.parseInt(br.readLine());

        int[] mem = new int[num + 1];
        mem[1] = 1;
        if(num >= 2) {
            mem[2] = 3;
        }
        for (int i = 3; i <= num; i++) {
            mem[i] = mem[i - 1] + mem[i - 2] + mem[i - 2];
            mem[i] %= 10007;
        }

        bw.write(mem[num] + "");
    }
}
