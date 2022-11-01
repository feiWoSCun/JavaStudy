import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        YuAnGong yuAnGong=new YuAnGong();
        ArrayList<YuAnGong> array=new ArrayList<>();
        Scanner sca=new Scanner(System.in);
        while (true) {
            System.out.println("1.添加员工");
            System.out.println("2.删除员工");
            System.out.println("3.查看员工");
            System.out.println("4.修改员工");
            System.out.println("5.退出");
            int next = sca.nextInt();
            YuAnGong yuan = new YuAnGong();
            switch (next) {
                case 1:
                    yuan.addEmployer(array);
                    break;
                case 2:
                    yuan.deleteEmployer(array);
                    break;
                case 3:
                    yuan.biAnLi(array);
                    break;
                case 4:
                    yuan.xiuGai(array);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
