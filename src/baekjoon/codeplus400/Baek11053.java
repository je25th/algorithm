package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baek11053 {
    //가장 긴 증가하는 부분 수열
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int len = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] mem = new int[len];
        int result = 0;
        for (int n = 0; n < len; n++) {
            mem[n] = 1;
            for (int i = 0; i < n; i++) {
                if(a[i] < a[n]) {
                    mem[n] = Math.max(mem[n], (mem[i] + 1));
                }
            }

            result = Math.max(result, mem[n]);
        }

        bw.write(result + "");
    }
}
