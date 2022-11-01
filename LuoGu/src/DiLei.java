import java.util.Scanner;
public class DiLei {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();//n表示为行
         int m = sca.nextInt();//m表示为列
      char[][] shuRu = new char[n + 2][m + 2];
        long[][] shuChu = new long[n + 2][m + 2];
        String[] string = new String[n];
        for (int a = 0; a <=n; a++) {
            string[a] = sca.nextLine();
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                if (string[a - 1].substring(b - 1, b) == "*") {
                    shuRu[a][b] = '*';
                    shuChu[a + 1][b + 1] += 1;
                    shuChu[a - 1][b - 1] += 1;
                    shuChu[a - 1][b + 1] += 1;
                    shuChu[a + 1][b - 1] += 1;
                    shuChu[a][b - 1] += 1;
                    shuChu[a][b + 1] += 1;
                    shuChu[a - 1][b] += 1;
                    shuChu[a + 1][b] += 1;
                    //  }
                }
            }
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                if (shuRu[a][b] == '*') {
                    System.out.print(shuRu[a][b]);
                } else
                    System.out.print(shuChu[a][b]);
            }
            System.out.println("\n");

        }
    }
    }
