package baekjoon.codeplus202;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek1935 implements BaekjoonShape {
    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String calc = br.readLine();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < calc.length(); i++) {
            char str = calc.charAt(i);
            if(str == '*' || str == '/'
                    || str == '+' || str == '-') {
                double b = stack.pop();
                double a = stack.pop();
                double c = 0;

                switch (str) {
                    case '*':
                        c = a * b;
                        break;
                    case '/':
                        c = a / b;
                        break;
                    case '+':
                        c = a + b;
                        break;
                    case '-':
                        c = a - b;
                        break;
                }
                stack.push(c);
            } else {
                stack.push((double)arr[str - 'A']);
            }
        }
        bw.write(String.format("%.2f",stack.pop()));

        bw.flush();
        bw.close();
        br.close();
    }
}
