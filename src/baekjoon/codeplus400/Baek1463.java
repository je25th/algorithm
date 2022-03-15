package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek1463 {
//1로 만들기
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int result = 0;

        int[] mem = new int[num + 1];
        mem[1] = 0;
        for (int i = 2; i <= num; i++) {
            mem[i] = mem[i - 1] + 1;
            if (i % 2 == 0 && mem[i] > mem[i / 2] + 1) {
                mem[i] = mem[i / 2] + 1;
            }
            if (i % 3 == 0 && mem[i] > mem[i / 3] + 1) {
                mem[i] = mem[i / 3] + 1;
            }
        }
        result = mem[num];

        bw.write(result + "");
    }
}
