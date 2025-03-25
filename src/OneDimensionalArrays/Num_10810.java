package OneDimensionalArrays;

import java.io.*;
import java.util.StringTokenizer;

public class Num_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        int i, j, k;

        for (int z = 0; z < M; z++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            for (int q = i - 1; q < j; q++) {
                arr[q] = k;
            }
        }

        for (int value : arr) {
            bw.write(value + " ");
        }

        bw.close();
    }
}
