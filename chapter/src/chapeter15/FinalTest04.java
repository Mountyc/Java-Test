package chapeter15;
/*
    上一个例子的结论:
    final修饰的实例变量，必须手动赋值。
    《重点》final修饰的变量，只能赋一次值。

    final修饰的实例变量一般添加static修饰。

    终极结论:
    static final联合修饰的变量称为"常量"。
    常量名建议全部大写，每个单词之间采用下划线衔接。

    常量:实际上常量和静态变量一样，区别在于:
        常量的值不能变。

    常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。

    常量一般都是公共的:public的。
 */
public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        //Chinese.COUNTRY = "美国";常量无法重新赋值。
    }
}
class Chinese{
    //身份证号，每一个人都不一样，对象级别的
    String idCard;
    //姓名，对象不同姓名一样。
    String name;
    //国家的值是一个固定值："中国"
    //实例变量在堆中，一个对象一份，100个对象100份
    //实例变量既要使用final修饰了，说明实例变量值不会随着对象的变化而变化。
    //该实例变量前面应该添加：static关键字，变为静态的，存储在方法区
    //static final String Country = "中国";
    static final String COUNTRY= "中国";

    //i永远是10，创建100个对象，i也是10；
    //i是10永远不会发生改变的，既然这样，没必要声明为实例变量，最好是静态的，节省内存空间
    static final int i = 10;
}
class MyMath{
    public static final double PI = 3.1415926;
}