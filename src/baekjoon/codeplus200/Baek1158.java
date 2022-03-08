package baekjoon.codeplus200;

import baekjoon.BaekjoonShape;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//요세푸스 문제
public class Baek1158 implements BaekjoonShape {

    Queue<Integer> data = new LinkedList<>();

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int[] anwser = new int[n];
        for (int i = 1; i <= n; i++) {
            data.add(i);
        }
        for (int i=0; i<n; i++) {
            if (i == 0) {
                bw.write("<");
            }
            for(int j=1; j<k; j++) {
                data.add(data.poll());
            }
            bw.write(data.poll()+"");
            if (i < n-1) {
                bw.write(", ");
            }else {
                bw.write(">");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
