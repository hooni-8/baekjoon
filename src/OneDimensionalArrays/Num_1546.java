package OneDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0.0;

        int max = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            sum += (double) arr[i] / max * 100.0;
        }
        System.out.print(sum / N);

    }
}
