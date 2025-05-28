package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int tmp = 0;

        while(true) {
            tmp += n;
            if (tmp >= X) {
                break;
            }
            n++;
        }

        int lineFirst = tmp - n + 1;
        int index = X - lineFirst + 1;
        int A = index;
        int B = n - index + 1;

        if (n % 2 == 0) {
            System.out.println(A + "/" + B);
        } else {
            System.out.println(B + "/" + A);
        }

    }
}
