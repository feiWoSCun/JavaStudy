import java.util.Scanner;

public class ChooseHero   {
   static int a;
    static int i;
   static String hero[] = new String[2];
    public void chooseHero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请创建你的角色");
        System.out.println("1.这是一个拿砍刀的角色\n2.这是一个拿双手剑的角色\n");
        for ( i = 0; i < hero.length; i++) {
            System.out.println("请输入第"+(i+1)+"个英雄的名字");
           this.hero[i]=sc.nextLine();
        }
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入你想选择的角色");
        a=sca.nextInt() ;

        System.out.println("你选择的是"+hero[a-1]+"\n"+"电脑选择的是"+hero[2-a]);
    }

}

