package Iteration;

import java.io.*;
import java.util.StringTokenizer;

public class Num_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());

            bw.write("Case #"+ i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
