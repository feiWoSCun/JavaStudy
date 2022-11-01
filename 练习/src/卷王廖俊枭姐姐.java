import java.util.Scanner;
public class 卷王廖俊枭姐姐 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.print("请输入平时成绩");
        int a=d.nextInt();
        System.out.print("请输入期中成绩");
        int b=d.nextInt();
        System.out.print("请输入期末成绩");
        int c=d.nextInt();
        double end=(a*(0.2)+b*(0.3)+c*(0.5));
        System.out.print("geigie你的最终成绩为："+end+"。");
        if(end<60)
            System.out.println("\ngiegie你就这点东西");
        else if (end>60)
            System.out.println("\ngiegie你好厉害丫");
    }
}