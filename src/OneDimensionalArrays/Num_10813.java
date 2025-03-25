package OneDimensionalArrays;

import java.io.*;
import java.util.StringTokenizer;

public class Num_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int q = 0; q < N; q++) {
            arr[q] = q + 1;
        }

        for (int w = 0; w < M; w++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        for (int value : arr) {
            bw.write(value + " ");
        }

        bw.close();
    }
}
