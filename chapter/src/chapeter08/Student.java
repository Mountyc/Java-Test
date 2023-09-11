package chapeter08;
/*
    1.观察学生对象的共同特征(只观察属性)
    有哪些共同特征:
    学号:采用int类型
    姓名:采用string类型
    年龄:采用int类型
    性别:采用char或者boolean类型
    住址:采用string类型

    注意:属性是成员变量。

    2.以上是分析总结的结果，可以开始写代码了:
    定义Student类，编写成员变量作为属性。

    3.变量有一个特点：
    必须先声明，在赋值，才能访问。
    成员变量可以不手动赋值？？？？？？？？？
 */
public class Student {
    // 属性

    //学号
    int Student;

    //姓名
    String name;

    //年龄
    int age;
    //性别
    boolean gender;
    //住址
    String place;

}
