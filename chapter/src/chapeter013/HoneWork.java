package chapeter013;

public class HoneWork {
    public static void main(String[] args){
        //创建乐手对象
        Musician musician = new Musician();
        //创建各种乐器对象
        ErHu erhu = new ErHu();
        Piano piano = new Piano();
        Violin violin = new Violin();
        //play
        musician.play(erhu);
        musician.play(piano);
        musician.play(violin);
    }
}
/*
class Musician{
    //实例变量
    Instrument i;
    //构造方法
    public Musician(){
    }
    public Musician(Instrument i){
        this.i = i;
    }
    //play{}方法
    public void play(){
        i.makeSound();
    }
}

 */
//乐手
class Musician{
    public void play(Instrument i){
        //编译阶段makeSound（）方法是Instrument的
        //运行阶段这个makeSound（）方法就不一定是谁的
        i.makeSound();
    }
}

//乐器父类
class Instrument{
    //乐器发声
    public void makeSound(){

    }
}
//子类
class ErHu extends Instrument{
    public void makeSound(){
        System.out.println("二胡的声音！！！");
    }
}
//子类
class Piano extends Instrument{
    public void makeSound(){
        System.out.println("钢琴的声音！！！");
    }
}
//子类
class Violin extends Instrument{
    public void makeSound(){
        System.out.println("小提琴的声音！！！");
    }
}
