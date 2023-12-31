package chapeter13;
/*
    当前程序存在的问题(设计上的问题)????
    鸟儿在执行move()方法的时候，最好输出的结果是:"鸟儿在飞翔"
    但是当前的程序在执行move()方法的时候输出的结果是:"动物在移动!"
    很显然Bird子类从Animal父类中继承讨来的move1)方法已经无法满足子类的业务需求.

 */
public class OverrideTest01 {
    public static void main(String[] args){
        //创建鸟对象
        Bird b = new Bird();
        //让鸟儿移动
        b.move();

        Cat c = new Cat();
        b.move();
    }
}
//父类
class Animal{

    //移动
    public void move(){
        System.out.println("动物在移动！");
    }
}
//子类
class Bird extends Animal{

    //子类继承父类中，有一些“行为”可能不需要改进，有一些“行为”可能面临着必须改进。
    //因为父类中继承过来的一些方法已经无法满足子类的业务需求。
}
class Cat extends Animal{

    //猫在移动的时候，我希望输出：猫在走猫步！！！
}
