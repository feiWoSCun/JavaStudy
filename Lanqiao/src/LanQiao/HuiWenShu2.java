package LanQiao;

public class HuiWenShu2 {
    static int c = 0;

    public static void main(String[] args) {
        for (int a = 1000; a <= 9999; a++) {
            String str = String.valueOf(a);
            for (int b = 0; b < 2; b++) {
                if (Integer.valueOf(str.substring(b, b + 1), 10)
                        == Integer.valueOf(str.substring(3 - b, 4 - b), 10)) {
                    c++;
                }
                switch (c) {
                    case (2):
                        System.out.println(a);

                }
            }
            c=0;
        }
    }
}