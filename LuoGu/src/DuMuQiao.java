import java.util.Scanner;

public class DuMuQiao {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x, y, z;
        x = sca.nextInt();//(桥的长度)
        y = sca.nextInt();//士兵数量
        if (y == 0)//(当士兵数量为0时)
            System.out.println(0 + " " + 0);
        else {
            int max = 0, min = 0;
            for (int i = 1; i <= y; i++) {
                z = sca.nextInt();
                max = max(max, max(z, x - z + 1));
                min = max(min(z, x - z + 1), min);
            }
            System.out.print(min + " " + max);
        }
    }

    private static int min(int a,int b){
       return (a>=b?b:a);
    }
    private static int max(int a,int b){
        return (a>=b?a:b);
    }
}
