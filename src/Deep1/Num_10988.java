package Deep1;

import java.util.Scanner;

public class Num_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        StringBuffer sb = new StringBuffer(text);

        String revSt = sb.reverse().toString();

        System.out.print(text.equals(revSt) ? 1 : 0);
    }
}
