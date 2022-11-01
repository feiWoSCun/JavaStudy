import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        /*Animal animal =new Animal(3);
        System.out.println(animal.a);*/
        char a = 'a';
        char b = 'b';
        Scanner sca=new Scanner(System.in);
        System.out.println();
        String[] d = new String[5];
        for (int e = 0; e < 5; e++) {
          d[e]=sca.nextLine();
        }
        for (int e = 0; e < 5; e++) {
            System.out.println(d[e]);
        }
    }
}
