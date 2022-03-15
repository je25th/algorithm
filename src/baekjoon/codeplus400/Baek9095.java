package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek9095 {

    //1, 2, 3 더하기
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        int testCnt = Integer.parseInt(br.readLine());
        for(int tc=0; tc<testCnt; tc++) {
            int num = Integer.parseInt(br.readLine());

            int[] mem = new int[num + 1];
            mem[0] = 1;
            if (num >= 1) {
                mem[1] = 1;
            }
            if (num >= 2) {
                mem[2] = 2;
            }
            if (num >= 3) {
                mem[3] = 3;
            }
            for (int i = 3; i <= num; i++) {
                mem[i] = mem[i - 1] + mem[i - 2] + mem[i - 3];
            }

            bw.write(mem[num] + "\n");
        }

    }
}
