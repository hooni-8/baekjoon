package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] answer = new int[N][4];

        for (int i = 0; i < N; i++) {
            int don = Integer.parseInt(br.readLine());

            if (don >= 25) {
                answer[i][0] = don / 25;
                don = don % 25;
            }
            if (don >= 10) {
                answer[i][1] = don / 10;
                don = don % 10;
            }
            if (don >= 5) {
                answer[i][2] = don / 5;
                don = don % 5;
            }
            if (don >= 1) {
                answer[i][3] = don / 1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
