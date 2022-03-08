package baekjoon.codeplus202;

import baekjoon.BaekjoonShape;

import java.io.*;

public class Baek10824 implements BaekjoonShape {

    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        long ab = Long.parseLong(str[0] + str[1]);
        long cd =  Long.parseLong(str[2] + str[3]);
        bw.write((ab+cd) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
