package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baek16194 {
    //카드 구매하기2
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] mem = new int[num + 1];
        mem[1] = p[0];
        for (int i = 2; i <= num; i++) {
            mem[i] = -1;
            for (int j = 1; j <= i; j++) {
                if(mem[i] == -1) {
                    mem[i] = mem[i - j] + p[j-1];
                } else {
                    mem[i] = Math.min(mem[i],mem[i - j] + p[j-1]);
                }
            }
        }

        bw.write(mem[num] + "");
    }
}
