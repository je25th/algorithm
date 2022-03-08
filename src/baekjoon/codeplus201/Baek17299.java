package baekjoon.codeplus201;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek17299 implements BaekjoonShape {
    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] cntArr = new int[1000001];
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(line[i]);
            cntArr[arr[i]] += 1;
        }

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[cnt];
        stack.push(0);
        for (int i = 1; i < cnt; i++) {
            int top = cntArr[arr[stack.peek()]];
            int now = cntArr[arr[i]];
            while(!stack.empty() && top < now) {
                int idx = stack.pop();
                answer[idx] = arr[i];
                if(!stack.empty() ) {
                    top = cntArr[arr[stack.peek()]];
                }
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }
        bw.append(answer[0]+"");
        for (int i = 1; i < cnt; i++) {
            bw.append(" " + answer[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
