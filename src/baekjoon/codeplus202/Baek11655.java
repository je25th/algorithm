package baekjoon.codeplus202;

import baekjoon.BaekjoonShape;

import java.io.*;

public class Baek11655 implements BaekjoonShape {
    @Override
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                int n = str.charAt(i) + 13;
                char ch = (char)( 65 + (n-65) % 26);
                bw.append(ch + "");
            }else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                int n = str.charAt(i) + 13;
                char ch = (char)( 97 + (n-97) % 26);
                bw.append(ch + "");
            }else {
                bw.append(str.charAt(i) + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
