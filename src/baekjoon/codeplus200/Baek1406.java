package baekjoon.codeplus200;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

//에디터
public class Baek1406 implements BaekjoonShape {

    Stack<Character> stackFront = new Stack<>();
    Stack<Character> stackBack = new Stack<>();

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine = br.readLine();
        for(int i=0; i<firstLine.length(); i++){
            stackFront.push(firstLine.charAt(i));
        }
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String[] line = br.readLine().split(" ");
            switch (line[0]) {
                case "L":
                    if(!stackFront.empty()) {
                        stackBack.push(stackFront.pop());
                    }
                    break;
                case "D":
                    if(!stackBack.empty()) {
                        stackFront.push(stackBack.pop());
                    }
                    break;
                case "B":
                    if(!stackFront.empty()) {
                        stackFront.pop();
                    }
                    break;
                case "P":
                    stackFront.push(line[1].charAt(0));
                    break;
            }
        }

/*      //시간초과
        String answer = "";
        while(!stackFront.empty()) {
            answer = stackFront.pop() + answer;
        }
        while(!stackBack.empty()) {
            answer += stackBack.pop();
        }
        bw.write(answer);
*/
        for(char front : stackFront) {
            bw.append(front);
        }
        while(!stackBack.empty()) {
            bw.append(stackBack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
