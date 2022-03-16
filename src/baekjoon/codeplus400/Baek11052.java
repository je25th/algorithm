package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baek11052 {
    //카드 구매하기
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] mem = new int[num + 1];
        mem[1] = p[0];
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                mem[i] = Math.max(mem[i],mem[i - j] + p[j-1]);
            }
        }

        bw.write(mem[num] + "");
    }
}
