package chapeter09;

/*
    java中关于方法调用时参数传递实际上只有一个规则共和：
    不管你是基本数据类型，还是引用数据类型，实际上在传递的时候都是
    将变量中保存的那个“值”复制一份，传过去。
 */
public class Test02 {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("main ---->" +p.age);//11
    }
    // 方法参数可以是基本参数数据类型，也可以是引用数据类型，只要是合法的数据类型就行
    public static void add(Person p){ // p是add方法的局部变量
        p.age++;
        System.out.println("add ---->" +p.age);// 11
    }

}
class Person{
    // 年龄属性，成员变量中的实例变量
    int age;
}
