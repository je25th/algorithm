package baekjoon;

import baekjoon.codeplus300.Baek2609;
import baekjoon.codeplus400.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Baek1912 sol = new Baek1912();
        sol.solution(br,bw);

        bw.flush();
        bw.close();
        br.close();
    }
}
