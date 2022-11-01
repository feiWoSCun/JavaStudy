import  java.util.LinkedList;
public class Chengfabiao {
    public static void main(String[] args) {
        for (int a= 1, b= 1; a>=b&&a<=9; b++) {

            System.out.print(b + "*" + a + "=" + (a * b) + " ");
            if (b == a) {
                a++;
                b = 0;
                System.out.println("");
            }


        }
        }
    }
