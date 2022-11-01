public class 找素数 {
    public static void main(String args[]){

        for (int a=2;a<=100;a++) {
            boolean c = true;

            for (int b = 2; b < a; b++) {
                if (a % b == 0)
                    c = false;
                continue;
            }

            System.out.println(c?  a+"是素数":a+"不是素数");



        }
    }
}

