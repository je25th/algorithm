package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Baek1912 {
    //연속합
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int len = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] mem = new int[len];
        mem[0] = a[0];
        int result = a[0];
        for (int n = 1; n < len; n++) {
            mem[n] = Math.max((mem[n-1]+a[n]),a[n]);
            result = Math.max(result, mem[n]);
        }

        bw.write(result + "");
    }
}
