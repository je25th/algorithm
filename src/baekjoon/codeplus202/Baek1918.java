package baekjoon.codeplus202;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek1918 implements BaekjoonShape {
    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int op = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' ) {
                while(!stack.empty() && stack.peek() != '('){
                    bw.append(stack.pop());
                }
                stack.push(ch);
            } else if(ch == '*' || ch == '/'){
                while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')){
                    bw.append(stack.pop());
                }
                stack.push(ch);
            } else if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                while (!stack.empty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    bw.append(stack.pop());
                }
            }else {
                bw.append(ch);
            }
        }

        while (!stack.empty()) {
            if(stack.peek() == '(') {
                stack.pop();
            } else {
                bw.append(stack.pop());
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public int getSize(char ch) {
        if(ch == '*' || ch == '/'){
            return 1;
        } else {
            return 0;
        }
    }
}
