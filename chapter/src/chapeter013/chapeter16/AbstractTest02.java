package chapeter013.chapeter16;
/*
    抽象类：
        1.抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。

        2.重要结论:重要结论五颗星*****(必须记住)
        一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
        这是java语法上强行规定，必须的，不然编译器就报错了。
        这里的覆盖或者说重写，也可以叫做实现。(对抽象的实现。)
 */
public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird();//向上转型。（自动类型转换）
        a.move();

        Animal x = new Cat();
        x.move();
    }
}
//动物类（抽象类）
abstract class Animal{
    //抽象方法
    public abstract void move();
}
//子类（非抽象）
//错误：bird不是抽象的，并且未覆盖Animal中的抽象方法move()
/*
class Bird extends Animal{
}
 */
class Bird extends Animal{
    //需要将从父类中继承过来的抽象方法进行覆盖/重写，或者也可以叫做“实现”。
    //把抽象的方法实现了
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔！");
    }
}
//如果Bird是抽象类的话，那么这个Animal中继承过来的抽象方法也可以不去重写/覆盖/实现。
/*
abstract class Bird extends Animal {
}
 */
/*
    有些内容不要死记硬背，讲讲道理。分析:
    Animal是父类，并且是 抽象的。
    Animal这个抽象类中有一个抽象方法move。
    Bird是子类，并且是非抽象的。
    Bird继承Animal之后，会将抽象方法继承过来。
*/
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
}