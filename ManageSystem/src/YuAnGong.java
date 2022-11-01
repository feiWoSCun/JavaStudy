import java.lang.reflect.Array;
import java.util.ArrayList;
import  java.util.Scanner;
public class YuAnGong {
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public YuAnGong(String name, String id, String sexy, String address) {
        this.name = name;
        this.id = id;
        this.sexy = sexy;
        this.address = address;
    }

    public YuAnGong() {
    }
    private String id;
    private String sexy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    Scanner sca = new Scanner(System.in);

    //重写toString方法
    public String toString() {
        return this.name + " " + this.id + " " + this.sexy + " " + this.address;
    }

    //创建员工对象数组
    //添加员工方法
    public void addEmployer(ArrayList<YuAnGong> array) {
        System.out.println("请输入员工姓名");
        String str = sca.nextLine();
        System.out.println("请输入员工ID");
        String sid = sca.nextLine();
        System.out.println("请输入员工性别");
        String sex = sca.nextLine();
        System.out.println("请输入员工住址");
        String add = sca.nextLine();
        YuAnGong yuanGong = new YuAnGong(str, sid, sex, add);
        array.add(yuanGong);
    }

    //删除员工方法
    public void deleteEmployer(ArrayList<YuAnGong> array) {
        System.out.println("请输入您想输入的员工学号");
        Scanner scaScanner=new Scanner(System.in);
        String sid = scaScanner.nextLine();
        if (sid == null) {
            System.out.println("请重新输入！");
        }
        int n = 0;
        int a = -1;
        for (int i = 0; i < array.size(); i++) {
            a = i;
            if (array.get(i).id.equals(sid)) {
                n++;
                break;
            }
        }
        if (n == 0)
            System.out.println("查无此人，请重新输入");
        else {
            System.out.println(array.get(a).name + " " + "学号:" + array.get(a).id + "已成功删除");
            array.remove(a);
        }
    }
    //查看所有员工属性
    public void biAnLi(ArrayList<YuAnGong> array) {
        System.out.println("1.查看所有员工");
        System.out.println("2.查找员工");
        Scanner next =new Scanner(System.in);
        int ab = next.nextInt();
        switch (ab) {
            case 1:
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
            break;
            case 2:
                System.out.println("请输入员工号");
                String yuanGongID = next.nextLine();
                if (yuanGongID == null) {
                    System.out.println("请重新输入！");
                }
                int n = 0;
                int a = -1;
                for (int i = 0; i < array.size(); i++) {
                    a = i;//a就是当前员工的号码
                    if (array.get(i).id.equals(yuanGongID)) {
                        n++;
                        break;
                    }
                }
                if (n == 0)
                    System.out.println("查无此人，请重新输入");
                if(n==1){
                    System.out.println(array.get(a));
                }
                break;
        }
    }
    //修改所有员工属性；
    public void xiuGai(ArrayList<YuAnGong> array) {

            System.out.println("请输入旧的员工号");
            String sid = sca.nextLine();
        int n = 0;
        int a = -1;
            if (sid == null) {
                System.out.println("请重新输入！");
            }

            for (int i = 0; i < array.size(); i++) {
                a = i;//a就是当前员工的号码
                if (array.get(i).id.equals(sid)) {
                    n++;
                    break;
                }
            }
            if (n == 0)
                System.out.println("查无此人，请重新输入");
            else {
                System.out.println("1.修改姓名");
                System.out.println("2.修改ID");
                System.out.println("3.修改住址");
                System.out.println("4.修改性别");
                System.out.println("5.退出");
                Scanner scanner =new Scanner(System.in);
                int delete = scanner.nextInt();
                switch (delete) {
                    case 1:
                        System.out.println("请输入新的名字");
                        array.get(a).name = sca.nextLine();
                        break;
                    case 2:
                        System.out.println("请输入新的ID");
                        array.get(a).id = sca.nextLine();
                        break;
                    case 3:
                        System.out.println("请输入新的地址");
                        array.get(a).address = sca.nextLine();
                        break;
                    case 4:
                        System.out.println("请输入性别");
                        array.get(a).sexy = sca.nextLine();
                        break;
                    case 5:
                        System.exit(0);
                }
        }
    }
}
