package Integer;

public class Identify {
    public static void main(String[] args) {
        //直接赋值基本数据类型的话，如果是在-128---+127之间的话，会直接从缓存池中返回；
        //如果不在这个范围的话，就new 一个integer对象，所以什么时候为true，什么时候为false，你心里应该有点数了吧！
        Integer a=100;
        Integer b=new Integer(100);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
