package chapeter13;
/*
    方法覆盖比较经典的案例
    一定注意：方法覆盖、重写的时候，建议将父类的方法复制粘贴，这样比较保险。
 */
public class OverrideTest03 {
    public static void main(String[] args){
        //创建中国人对象
        ChinaPeople p1 = new ChinaPeople();
        p1.setName("张三");
        p1.speak();

        //创建美国人对象
        AmericanPeople p2 = new AmericanPeople();
        p2.setName("jack");
        p2.speak();
    }
}
class People{
    //属性
    private String name;
    //构造
    public People(){

    }
    public People(String name){
        this.name = name;
    }
    //setter和getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //人都会说话
    public void speak(){
        System.out.println(name + "....");
    }
}
//中国人
class ChinaPeople extends People{
    //中国人说话是汉语
    //所以子类需要对父类的speak()方法进行重写
    public void speak(){
        System.out.println(this.getName() + "正在说汉语");
    }
}
//美国人
class AmericanPeople extends People{
    //美国人说话是英语
    //所以子类需要对父类的speak（）方法进行重写
    public void speak(){
        System.out.println(getName() + " Speak English");
    }
}