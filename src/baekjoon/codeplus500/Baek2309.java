package baekjoon.codeplus500;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Baek2309 {

    //일곱 난쟁이
    public void solution(BufferedReader br, BufferedWriter bw) throws IOException {

        List<Integer> input = new ArrayList<>();
        String str = "";
        int sum = 0;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            input.add(num);
            sum += num;
        }

        boolean end = false;
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (i!=j && sum - input.get(i) - input.get(j) == 100) {
                    input.set(i, -1);
                    input.set(j, -1);
                    end = true;
                    break;
                }
            }
            if (end) {
                break;
            }
        }
        input.sort(Comparator.naturalOrder());
        input.stream().filter(x -> x>0).forEach(x -> System.out.println(x));

        //bw.write((mem[input][0] + mem[input][1]) + "");
    }
}
