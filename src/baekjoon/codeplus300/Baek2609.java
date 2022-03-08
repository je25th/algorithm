package baekjoon.codeplus300;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Baek2609 {
//최대공약수와 최소공배수
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {
        String num[] = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int g = gcd(a, b);
        int l = g*(a/g)*(b/g);
        bw.write(g+"\n");
        bw.write(l+"");
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
