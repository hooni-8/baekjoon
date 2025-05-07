package Deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] temp = {1, 1, 2, 2, 2, 8};

        int[] arr = new int[6];

        int[] answer = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < arr.length; j++) {
            answer[j] = temp[j] - arr[j];
        }

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}
