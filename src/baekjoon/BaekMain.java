package baekjoon;

import baekjoon.codeplus300.Baek2609;

import java.io.*;

public class BaekMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Baek2609 sol = new Baek2609();
        sol.solution(br,bw);

        bw.flush();
        bw.close();
        br.close();
    }
}
