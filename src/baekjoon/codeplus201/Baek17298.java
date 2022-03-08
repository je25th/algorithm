package baekjoon.codeplus201;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek17298 implements BaekjoonShape {

    Stack<int[]> data = new Stack<>();

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            int n = Integer.parseInt(line[i]);
            while(!data.empty() && data.peek()[1] < n) {
                int[] pop = data.pop();
                answer[pop[0]] = n;
            }
            data.push(new int[]{i, n});
        }
        while (!data.empty()) {
            int[] pop = data.pop();
            answer[pop[0]] = -1;
        }
        for (int i=0; i<cnt; i++) {
            bw.append(answer[i]+"");
            if (i <= cnt -1) {
                bw.append(" ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
