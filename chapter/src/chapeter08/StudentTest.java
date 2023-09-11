package chapeter08;
/*
    对象的创建和使用
    创建对象的语法是什么?
        目前死记硬背，先记住。后面你就理解了。
            new 类名();
            类是模板，通过一个类，是可以创建n多个对象的。
            new是一个运算符。专门负责对象的创建。
            Student s1=new Student();
            和
            int i =100;
            解释一下:
                i是变量名
                int是变量的数据类型
                100是具体的数据。

                s1是变量名(s1不能叫做对象。s1)
                Student是变量s1的数据类型(引用数据类型)
                new Student()这是一个对象。(学生类创建出来的学生对象。)
    数据类型包括两种:
    基本数据类型:byte short int long float double boolean char引用数据类型:string、Student.....
    java中所有的“类”都属于引用数据类型。
*/

public class StudentTest {
    public static void main(String[] args){
        int i = 100;
        System.out.println("i = " +i);

       Student s1 = new Student();//和 int i = 10；一个道理
        //再通过该类创建一个全新的对象
        Student s2 = new Student();

        //以上的这个程序就相当于通过Student类实例化了两个Students对象。
        //创建的对象个数没有限制，可以随意。只要有模板类就行。
        //两个对象都是学生类型
    }
}
