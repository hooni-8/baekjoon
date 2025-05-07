package Deep1;

import java.util.Scanner;

public class Num_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int textLen = text.length();
        int cnt = 0;

        for (int i = 0; i < textLen; i++) {
            char c = text.charAt(i);

            if (c == 'c' && i < textLen - 1) {

                char s = text.charAt(i + 1);

                if (s == '=' || s == '-') {
                    i++;
                }
            }

            else if (c == 'd') {

                if (i < text.length() - 1 && text.charAt(i + 1) == '-') {
                    i++;
                } else if (i < text.length() - 2 && text.charAt(i + 1) == 'z' && text.charAt(i + 2) == '=') {
                    i += 2;
                }
            }

            else if ((c == 'l' || c == 'n') && i < textLen - 1) {
                if (text.charAt(i + 1) == 'j') {
                    i++;
                }
            }

            else if ((c == 's' || c == 'z') && i < textLen - 1) {
                if (text.charAt(i + 1) == '=') {
                    i++;
                }
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
