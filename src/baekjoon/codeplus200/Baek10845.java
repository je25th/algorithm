package baekjoon.codeplus200;

import baekjoon.BaekjoonShape;

import java.io.*;

//큐
public class Baek10845 implements BaekjoonShape {

    int[] queue = new int[10001];
    int first = 0;
    int nextEnd = 0;

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String[] line = br.readLine().split(" ");
            switch (line[0]) {
                case "push":
                    push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    bw.append(pop()+"\n");
                    break;
                case "size":
                    bw.append(size()+"\n");
                    break;
                case "empty":
                    bw.append(empty()+"\n");
                    break;
                case "front":
                    bw.append(front()+"\n");
                    break;
                case "back":
                    bw.append(back()+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public void push(int x) {
        queue[nextEnd++] = x;
    }

    public int pop() {
        if(empty() == 1){
            return -1;
        }
        return queue[first++];
    }

    public int size() {
        return nextEnd - first;
    }

    public int empty() {
        if(first == nextEnd){
            return 1;
        }
        return 0;
    }

    public int front() {
        if(empty() == 1){
            return -1;
        }
        return queue[first];
    }

    public int back() {
        if(empty() == 1){
            return -1;
        }
        return queue[nextEnd - 1];
    }
}
