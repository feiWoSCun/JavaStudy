import java.util.Scanner;
public class Shuzu {
    public static void main(String[] args) {
        int arr[] = {67, 23, 28, 98, 76, 56};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int ciShu = 0; ciShu < arr.length - i - 1; ciShu++) {
                if (arr[ciShu] < arr[ciShu + 1]) {
                    int a;
                    a = arr[ciShu];
                    arr[ciShu] = arr[ciShu + 1];
                    arr[ciShu + 1] = a;
                }
            }
            System.out.print("第" + i + "次循环后的顺序是:");
            for (int c = 0; c < 6; c++) {
                System.out.print(arr[c] + ",");
            }
            System.out.println("");
        }
     Scanner d=new Scanner(System.in);
    System.out.print("请添加一个数:");
    int other = d.nextInt();
    int arr1[] = {67, 23, 28, 98, 76, 56, other};
        for (int a = 0; a < arr1.length - 1; a++) {
            for (int ciShu = 0; ciShu < arr1.length - a - 1; ciShu++) {
                if (arr1[ciShu] < arr1 [ciShu + 1]) {
                    int b;
                    b = arr1[ciShu];
                    arr1[ciShu] = arr1[ciShu + 1];
                    arr1[ciShu + 1] = b;
                }
            }
            System.out.print("第" + a + "次循环后的顺序是:");
            for (int c = 0; c < 7; c++) {
                System.out.print(arr1[c] + ",");
            }
            System.out.println("");
        }

}






}
