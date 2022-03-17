package baekjoon.codeplus400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek15990 {
    static final int limit = 100000;
    static final long mod = 1000000009L;

    //1, 2, 3 더하기 5
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        long[][] mem = new long[limit + 1][4];

        for(int i=1; i<=limit; i++) {
            //마지막수 1
            if(i >= 1) {//마지막수가 1이니까 합은 1보다 크거나 같음
                //마지막수 2인것과 3인것의 합
                mem[i][1] = mem[i - 1][2] + mem[i - 1][3];
                if (i == 1) {
                    //합이 1인것 중 마지막수가 1인것은 1 한가지경우 뿐
                    mem[i][1] = 1;
                }
            }
            //마지막수 2
            if(i >= 2) {//마지막수가 2이니까 합은 2보다 크거나 같음
                mem[i][2] = mem[i - 2][1] + mem[i - 2][3];
                if (i == 2) {
                    //합이 2인것 중 마지막수가 2인것은 2 한가지경우 뿐
                    mem[i][2] = 1;
                }
            }
            //마지막수 3
            if(i >= 3) {//마지막수가 3이니까 합은 3보다 크거나 같음
                mem[i][3] = mem[i - 3][1] + mem[i - 3][2];
                if (i == 3) {
                    //합이 3인것 중 마지막수가 3인것은 3 한가지경우 뿐
                    mem[i][3] = 1;
                }
            }
            mem[i][1] %= mod;
            mem[i][2] %= mod;
            mem[i][3] %= mod;

        }

        int count = Integer.parseInt(br.readLine());
        for (int cnt = 0; cnt < count; cnt++) {
            int n = Integer.parseInt(br.readLine());
            bw.write((mem[n][1] + mem[n][2] + mem[n][3]) % mod + "\n");
        }
    }
}
