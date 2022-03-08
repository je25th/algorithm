package baekjoon.codeplus202;

import baekjoon.BaekjoonShape;

import java.io.*;

public class Baek10820 implements BaekjoonShape {
    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";
        while ((str = br.readLine()) != null) {
            int[] result = new int[4];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 65 && ch <= 90) {
                    result[1]++;
                } else if (ch >= 97 && ch <= 122) {
                    result[0]++;
                } else if (ch >= 48 && ch <= 57) {
                    result[2]++;
                } else {
                    result[3]++;
                }
            }
            bw.append(result[0] + " " + result[1] + " " + result[2] + " " + result[3] + "\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
