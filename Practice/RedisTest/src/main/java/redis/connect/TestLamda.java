package redis.connect;

public class TestLamda {

    public static void main(String[] args) {
        test01((value,string)-> string);
    }
    public static String test01(Test test){
        int a=1;
        int b=2;
        String str="luobin";
        String test1 = test.test(a, str);
        return str+test1;
    }
}
