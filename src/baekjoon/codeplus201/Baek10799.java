package baekjoon.codeplus201;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek10799 implements BaekjoonShape {

    Stack<Integer> data = new Stack<>();

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int answer = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                data.push(i);
            }else {
                int pop = data.pop();
                if (pop == i - 1) {
                    answer += data.size();
                }else {
                    answer += 1;
                }
            }
        }
        bw.write(answer+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
