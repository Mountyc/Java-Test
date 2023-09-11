package chapeter09;

import chapeter091.Student;

public class StudentTest {
    public static void main(String[] args){
        //不能通过类名来直接访问“实例变量”
        //System.out.println(Student name);

        //i属于局部变量
        //局部变量存储在栈内存中。（栈主要存储局部变量）
        //int i = 100;

        //s1 s2 也属于局部变量
        //s1这个局部变量叫引用
        chapeter091.Student s1 = new chapeter091.Student();
        //这么访问实例变量
        //语法：引用.实例变量名
        System.out.println(s1.no);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);
        System.out.println(s1.addr);

        System.out.println("__________________________________________");

        //s2也是局部变量叫引用
        chapeter091.Student s2 = new Student();
        System.out.println(s2.no);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
        System.out.println(s2.addr);
        //程序执行到此处我可以修改s1学生学号
        //通过“=”赋值方式将内存中实例变量的值修改
        s1.no = 110;
        s1.name = "张三";
        s1.age = 20;
        s1.sex = true;
        s1.addr  = "深圳宝安区";

        System.out.println("学号 =" +s1.no);
        System.out.println("姓名 =" +s1.name);
        System.out.println("年龄 =" +s1.age);
        System.out.println("性别 =" +s1.sex);
        System.out.println("住址 =" +s1.addr);
        s1.addr = "北京大兴区";

    }
    public static void method(){
        //i s1 s2 都是main方法中的局部变量这里无法访问。

        //System.out.println(i);
        //System.out.println(s1);
        //System.out.println(s2);
    }
}
