package chapeter11;
/*
    实例的:一定需要使用"引用"来访问。
        静态的:
        建议使用"类名"来访问，但使用"引用."也行(不建议使用"引用.")。
        静态的如果使用"引用"来访问会让程序员产生困惑:程序员以为是实例的呢。

        结论:
        空指针异常只有在什么情况下才会发生呢?
        只有在"空引用"访问"实例"相关的，都会出现空指针异常。
        */
public class StaticTest03 {
    public static void main(String[] args){
        //通过"类名."的方式访问静态变量
        System.out.println(Chinese02.country);
        //创建对象
        Chinese02 c1 = new Chinese02("1233433123","张三");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(c1.country);
        //c1为空引用
        c1 = null;
        //不会出现空指针异常
        System.out.println(c1.country);
        //会出现空指针异常，因为name是实例变量
        //System.out.println(c1.name);
    }
}
class Chinese02{
    //实例变量
    String idCard;
    String name;
    //静态变量
    static String country = "中国";
    //构造方法
    public Chinese02(String x,String y){
        idCard = x;
        name = y;
    }
}
