package chapeter15;
/*
    final
        1、final是java语言中的一个关键字。

        2、final表示:
            最终的，不可变的。

        3、final修饰的变量?
            final修饰局部变量，一但赋值不能重新赋值。

        4、final修饰的方法?
            final修饰的方法无法被覆盖，被重写。

        5、final修饰的类?
            final修饰的类无法继承。

        6.《提示》 final控制不了能不能调用的问题。final管的是啥？
        final修饰的表示最后的，不能变的，不能改的。

        重点【精辟：final修饰的变量，只能赋一次值。】
*/
public class FinalTest01 {
    public static void main(String[] args) {
        //局部变量
        int i = 100;
        //重新赋值
        i = 200;

        //局部变量
        final int k = 100;
        //重新赋值
        //错误：无法为最终变量k分配值
        //k = 300;

        final int m;
        //第一次赋值
        m = 200;
        //重新赋值
        //编译报错。
        //m = 300;
    }
}
final class A{// A没有子孙
     }
    //B类继承A类，相当于对A类的功能进行扩展。如果你不希望别人对A类型进行扩展。
    //你可以给A类加final关键字，这样的话A类就无法继承了。
    // 错误:无法从最终A进行继承
/*
    class B extendsA{
    }*/
    //错误:无法从最终string进行继承
/*
    class MyString extends string{
}
 */

class C{
    public final void doSome(){
        System.out.println("C's doSome....");
    }
}
class D extends C{
    /*
    public final void doSome(){
        System.out.println("D's doSome....");
    }
     */
}
