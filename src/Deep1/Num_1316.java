package Deep1;

import java.util.Scanner;

public class Num_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = N;

        for (int i = 0 ; i < N; i++) {
            String s = sc.next();
            int[] arr = new int[26];

            for (int j = 0; j < s.length(); j++) {
                if (j > 0 && s.charAt(j - 1) == s.charAt(j)) {
                    continue;
                }

                if (arr[s.charAt(j) - 97] == 1) {
                    cnt--;
                    break;
                } else {
                    arr[s.charAt(j) - 97] = 1;
                }
            }
        }
        System.out.print(cnt);
    }
}
