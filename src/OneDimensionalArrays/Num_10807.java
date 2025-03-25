package OneDimensionalArrays;

import java.io.*;
import java.util.StringTokenizer;

public class Num_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int V = Integer.parseInt(br.readLine());

        for (int j = 0; j < arr.length; j++) {
            if (V == arr[j]) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
