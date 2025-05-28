package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int tmp = 1;
        int cnt = 1;

        while (true) {
            tmp += 6 * (cnt - 1);
            if (tmp >= N) {
                System.out.println(cnt);
                break;
            }
            cnt++;
        }
    }
}
