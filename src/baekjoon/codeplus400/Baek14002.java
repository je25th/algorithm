package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baek14002 {
    //가장 긴 증가하는 부분 수열4
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int len = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] mem = new int[len];
        int[] reason = new int[len];
        int result = 0;
        int resultIdx = 0;
        for (int n = 0; n < len; n++) {
            mem[n] = 1;
            reason[n] = -1;
            for (int i = 0; i < n; i++) {
                if(a[i] < a[n] && (mem[n] < (mem[i] + 1))) {
                    mem[n] = mem[i] + 1;
                    reason[n] = i;
                }
            }

            if (result < mem[n]) {
                result = mem[n];
                resultIdx = n;
            }
        }

        bw.write(result + "\n");
        printSeq(bw, a, reason, resultIdx);
    }

    private void printSeq(BufferedWriter bw, int[] a, int[] reason, int idx) throws IOException {
        if (reason[idx] == -1) {
            bw.write(a[idx] + " ");
        } else {
            printSeq(bw, a, reason, reason[idx]);
            bw.write(a[idx] + " ");
        }
    }
}
