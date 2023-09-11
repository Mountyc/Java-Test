package chapeter11;
/*
    程序在怎么变，万变不离其中，有一个固体的规律
        所有的实例相关都是先创建对象，通过“引用.”来访问。
        所有的静态相关的都是直接采用”类名.“来访问。

    总有一些问题是需要记忆的，在这些记忆的基础上进行分析。
 */
public class Review02 {
    public void m1(){}
    public void m2(){}
    //实例方法
    public void x(){//这个是实例方法，执行这个方法的过程当中，当前对象是存在的
        m1();
        m2();

        m3();
        m4();
    }
    public static void m3(){}
    public static void m4(){}

/*
第一步:
        main方法是静态的，JVM调用main方法的时候直接采用的是"类名"的方式。所以main方法中没有this.
第二步:
        m1()和m2()方法是实例方法，按照java语法规则来说，实例方法必须先
        new对象，通过"引用"的方式访问。
*/

    public static void main(String[] args){
        //编译报错
        //m1();
        //m2();
        m3();
        m4();
    }
}
