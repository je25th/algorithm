package baekjoon.codeplus201;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.Stack;

public class Baek17413 implements BaekjoonShape {

    Stack<Character> data = new Stack<>();

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        boolean tag = false;
        for (int i = 0; i < line.length(); i++) {

            if(!tag && line.charAt(i) == ' ') {
                while (!data.empty()) {
                    bw.append(data.pop());
                }
                bw.append(' ');
            }else if(line.charAt(i) ==  '<') {
                while (!data.empty()) {
                    bw.append(data.pop());
                }
                tag = true;
            }else if(line.charAt(i) ==  '>') {
                bw.append(line.charAt(i));
                tag = false;
            } else if(!tag){
                data.push(line.charAt(i));
            }

            if (tag) {
                bw.append(line.charAt(i));
            }
        }
        while (!data.empty()) {
            bw.append(data.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
