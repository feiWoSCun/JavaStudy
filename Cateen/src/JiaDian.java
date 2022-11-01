import java.security.PublicKey;
import java.util.Scanner;
public class JiaDian  {
    int dianShu=40;
    void jiaDian (){
    Scanner sca=new Scanner(System.in);
        System.out.println("你有"+dianShu+"点属性值可以赋值");
        Hero hero0=new Hero(100,15,10);
        for(int dianShu=40;dianShu>0;dianShu=dianShu) {
        System.out.println("1.增加生命值\n2.增加防御力\n3.增加攻击力");
        int a=sca.nextInt();
            switch (a) {
                case (1): {
                    System.out.println("您要输入的属性点为");
                    int b = sca.nextInt();
                    hero0.setLife(hero0.getLife() + b * 6);
                    System.out.println("生命值增加为" + hero0.getLife());
                    System.out.println("你还剩" + (dianShu - b) + "点属性值");
                    dianShu = dianShu - b;
                    break;
                }
                case (2): {
                    System.out.println("您要输入的属性点是");
                    int c = sca.nextInt();
                    hero0.setAttract(hero0.getAttract() + c);
                    System.out.println("攻击力增加为" + hero0.getAttract());
                    System.out.println("你还剩" + (dianShu - c) + "点属性值");
                    dianShu = dianShu - c;
                    break;
                }
                case (3):
                    System.out.println("您要输入的属性点是");
                    int d = sca.nextInt();
                    hero0.setDefence(hero0.getDefence()+d);
                    System.out.println("防御力增加为" + hero0.getDefence());
                    System.out.println("你还剩" + (dianShu - d) + "点属性值");
                      dianShu = dianShu - d;
                    break;
            }
        }
ChooseHero choose=new ChooseHero();
        System.out.println("最终赋值结果\n"+choose.hero[choose.a-1]+"\n"+"生命值是:"+hero0.getLife()+"\n"+"防御力是"
                +hero0.getDefence()+"\n"+"攻击力是"+"\n"+hero0.getAttract()+"\n");
    }









}
