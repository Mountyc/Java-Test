package chapeter013.chapeter16;
/*
    继承和实现都存在的话
        extends 关键字在前
        implements 关键字在后。
 */
public class Test04 {
    public static void main(String[] args) {
        Flyable f = new Cat02();
        f.fly();

        //同一个接口
        Flyable f2 = new Pig();
        //调用同一个方法，执行的效果不同
        f2.fly();

        Flyable f3 = new Fish();
        f3.fly();
    }
}
//动物类：父类
class Animal02{
}
//可飞翔的接口（是一对翅膀）
//能插拔的就是接口。（没有接口你怎么插拔）
//内存条插到主板上，他们之间有接口。内存条可以更换。
//接口通常提取的是行为动作
interface Flyable{
    void fly();
}
//动物类子类：猫类
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫的身上，让猫变可以飞翔
class Cat02 extends Animal02 implements Flyable{
    public void fly(){
        System.out.println("猫在天空飞，很神奇！！！");
    }
}
//蛇类，如果你不想让他飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀
class Snake extends Animal02{

}
//想飞就插翅膀这个接口
class Pig extends Animal02 implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是一直会飞的猪！！！");
    }
}
class Fish implements Flyable{//默认继承Object。
    @Override
    public void fly() {
        System.out.println("我是六眼飞鱼（流言蜚语）！！！");
    }
}
