package chapeter15;
/*
    final修饰的实例变量呢？
        《重点：万变不离其宗》：final修饰的变量只能赋值一次（这句话到哪里都好使）

    你是否记得：实例变量如果没有手动赋值的话，系统会赋默认值。

    java程序设计：不背锅！！！甩锅甩得很好！！！！

    实例变量在什么时候赋值（初始化）？
        构造方法执行的过程中赋值。（new的时候赋值）

     终极结论：
     final修饰的实例变量，系统不负责赋默认值，要求程序员必须手动赋值。
     这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。
 */
public class FinalTest03 {
    public static void main(String[] args) {
        //创建对象不一定必须要调用无参的构造方法
        User user = new User(111.0);
        User user2 = new User(0.0);
    }
}
class User{
    //实例变量
   // final int age;

    //实例变量
    //可以，因为程序员手动赋值了
    final double height = 1.8;

    //一下这一堆代码全部联合起来，weight变量也是赋值一次。
    //实例变量
    final double weight;

    //构造方法
    /*
    public User(){
    System.out.println("Hello,World");
        this.weight = 80;//只要我赶在系统赋默认值之前赋值就行。
        //this.weight = 81;这个不行
    }

     */
    public User (double d){
        this.weight = d;
    }
}