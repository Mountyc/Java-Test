package Inner;
/*
    匿名内部类:
        1、什么是内部类?
        内部类:在类的内部又定义了一个新的类。被称为内部类。

        2、内部类的分类:
        静态内部类:类似于静态变量实例内部类:类似于实例变量局部内部类:类似于局部变量
        3、使用内部类编写的代码，可读性很差。能不用尽量不用。

        4、匿名内部类是局部内部类的一种。
        因为这个类没有名字而得名，叫做匿名内部类。

        5、学习匿名内部类主要是让大家以后在阅读别人代码的时候，能够理解。并不代表以后都要这样写。
        因为匿名内部类有两个缺点:
        缺点1:太复杂，太乱，可读性差。
        缺点2:类没有名字，以后想重复使用，不能用。

        6、不理解算了，你只要记住这种写法就行。
 */
public class Test01 {
    //静态变量
    static String country;
    //该类再类的内部，所以称为内部类
    //由于前面有static，所以称为“静态内部类”
    public static class Inner1{
    }
    //实例变量
    int age;
    //该类在类的内部，所以称为内部类
    //没有static叫做实例内部类。
    class Inner2{
    }
    //方法
    public void doSome(){
        //局部变量
        int i = 100;
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Inner3{}
    }
    public void doOther(){
        //doSome()方法中的局部内部类Inner3，在doOther（）中不能用。
    }
    //main方法，入口
    public static void main(String[] args) {
        //调用MyMath中的mySum方法
        MyMath mm = new MyMath();
        /*
        Computer c = new ComputeImp1();
        mm.mySum(c,100,200);
         */
        mm.mySum(new Computer(){
            public int sum(int a,int b){
                return a +b;
            }
        },100,200);
    }
}
//负责计算的接口
interface Computer{
    //抽象接口
    int sum(int a,int b);
}
//你自动会在这里编写一个Compute接口的实现类
/*
class ComputeImp1 implements Computer{
    //对方法的实现
    public int sum(int a,int b){
        return a +b;
    }
}
 */
//数学类
class MyMath{
    //数学求和方法
    public void mySum(Computer c ,int x,int y){
        int reValue = c.sum(x,y);
        System.out.println(x + "+" + y + "=" + reValue);
    }
}