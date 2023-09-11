package chapeter11;
/*
    栈:方法只要执行，会压栈。(局部变量)

    堆:new出来的对象都在堆中。垃圾回收器主要针对。(实例变量)

    方法区:类的信息，字节码信息，代码片段。(静态变量)
    方法的代码片段放在方法区，但是方法执行过程当中需要的内存在栈中。
 */
public class StaticTest07 {
    //静态变量在什么时候初始化？类加载时初始化
    //静态变量存储在哪里？方法区
    static int i = 100;

    //静态代码块什么时候执行？类加载时执行
    static {
        //这里可以访问i吗？
        System.out.println("i = " +i);
    }

    //实例变量
    int k = 111;//k变量是实例变量，在构造方法执行时内存空间才会开辟
    static {
        //static静态代码块在类加载时执行，并且只执行一次
        //k变量不可以访问
        //类加载时，k变量空间还没有开辟出来
        //System.out.println("k = " +k);

        //这里不能访问name
        //错误非法向前引用
        //System.out.println("name = " +name);
    }
    static String name = "zhangSan";

    //入口（main方法执行之前实际上执行了很多代码）
    public static void main(String[] args){
        System.out.println("main begin");
    }
}
/*
    总结:
        到目前为止，你遇到的所有java程序，有顺序要求的是哪些?
    第一:对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行。
    第二:静态代码块1和静态代码块2是有先后顺序的。
    第三:静态代码块和静态变量是有先后顺序的。
*/
