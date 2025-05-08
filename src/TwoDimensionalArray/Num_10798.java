package TwoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] cArr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < tmp.length(); j++) {
                cArr[i][j] = tmp.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (cArr[j][i] != '\0') {
                    System.out.print(cArr[j][i]);
                }
            }
        }
    }
}
