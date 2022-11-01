package LanQiao;

public class QinMi {
    static float c = 0, d = 0;

    public static void main(String[] args) {
        for (float a = 1; a <= 1000; a++) {
            for (float b = 1; b <= a - 1; b++) {
                if (a % b == 0) {
                    c += b;
                }
            }
            for (float e = 1; e <= c - 1; e++) {
                if (c % e == 0) {
                    d += e;
                }
            }
                if (d == a && c != a) {
                    System.out.println(a);
            }
            c=0;d=0;
        }
    }
}



