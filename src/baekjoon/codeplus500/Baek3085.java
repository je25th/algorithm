package baekjoon.codeplus500;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Baek3085 {

    //사탕 게임
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        int size = Integer.parseInt(br.readLine());
        char[][] input = new char[size][size];
        for(int i=0; i<size; i++) {
            input[i] = br.readLine().toCharArray();
        }

        int result = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j+1 < size) {
                    //swap
                    char tmp = input[i][j];
                    input[i][j] = input[i][j + 1];
                    input[i][j + 1] = tmp;

                    int len = maxLength(input);
                    if (result < len) {
                        result = len;
                    }

                    //swap
                    tmp = input[i][j];
                    input[i][j] = input[i][j + 1];
                    input[i][j + 1] = tmp;
                }
                if(i+1 < size) {
                    //swap
                    char tmp = input[i][j];
                    input[i][j] = input[i + 1][j];
                    input[i + 1][j] = tmp;

                    int len = maxLength(input);
                    if (result < len) {
                        result = len;
                    }

                    //swap
                    tmp = input[i][j];
                    input[i][j] = input[i + 1][j];
                    input[i + 1][j] = tmp;
                }
            }
        }

        bw.write(result + "");

        //bw.write((mem[input][0] + mem[input][1]) + "");
    }

    private int maxLength(char[][] array) {
        int size = array.length;
        int result = 0;
        for (int i = 0; i < size; i++) {
            int len = 1;
            for (int j = 1; j < size; j++) {
                if (array[i][j] == array[i][j - 1]) {
                    len++;
                } else {
                    len = 1;
                }
                if (result < len) {
                    result = len;
                }
            }

            len = 1;
            for (int j = 1; j < size; j++) {
                if (array[j][i] == array[j-1][i]) {
                    len++;
                } else {
                    len = 1;
                }
                if (result < len) {
                    result = len;
                }
            }
        }

        return result;
    }
}
