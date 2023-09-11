package chapeter09;
/*
    空指针异常（NullPointerException）

    关于垃圾回收器：GC
        在java语言中，垃圾回收器主要针对的是堆内存。
        当一个java对象没有任何引用指向该对象的时候，
        GC会考虑将该垃圾数据释放回收掉。

    出现空指针异常的前提条件？
        “空引用”访问实例【对象相关】相关的数据时，都会出现空指针异常。
 */

public class NullPointerTest {
    public static void main(String[] args){
        //创建客户对象
        Customer c = new Customer();
        //访问这个客户id
        System.out.println(c.id);

        //重新给id赋值
        c.id = 9521;
        System.out.println("客户的id为 = " + c.id);

        c = null;
        //NullPointerException
        //编译器没问题，因为编译器只检查语法。
        System.out.println(c.id);
    }
}
class Customer{
    //客户id
    int id;//成员变量中的实例变量，应该先创建对象，然后通过“引用”的方式访问。

}