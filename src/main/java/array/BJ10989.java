package array;

import java.io.*;

public class BJ10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[10001];
        for (int i = 0; i <n; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10000; i++) {
            while(cnt[i] --> 0){
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}
