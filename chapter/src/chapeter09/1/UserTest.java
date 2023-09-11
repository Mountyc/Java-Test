package chapeter09;
/*
    1.构造方法对应的英语单词： Constructor【构造器】
    2.构造方法作用：
        创建对象，并且创建对象的过程中给属性赋值（初始化。）
    3.
 */

public class UserTest {
    public static void main(String[] args){
        chapeter091.User u = new chapeter091.User();

        System.out.println(u.id);
        System.out.println(u.name);
        System.out.println(u.age);
    }
}
