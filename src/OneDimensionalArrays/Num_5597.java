package OneDimensionalArrays;

import java.io.*;

public class Num_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[tmp - 1] = 1;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 1) {
                bw.write((j + 1) + "\n");
            }
        }

        bw.close();
    }
}
