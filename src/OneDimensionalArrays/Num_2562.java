package OneDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int cnt = 1;

        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                cnt = j + 1;
            }
        }

        System.out.println(max + "\n" + cnt);
    }
}
