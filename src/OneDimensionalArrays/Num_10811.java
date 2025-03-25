package OneDimensionalArrays;

import java.io.*;
import java.util.StringTokenizer;

public class Num_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int a = 0; a < N; a++) {
            arr[a] = a + 1;
        }

        for (int b = 0; b < M; b++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            for (int c = i; c <= j; c++) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        for (int value : arr) {
            bw.write(value + " ");
        }

        bw.close();
    }
}
