package chapeter11;

public class HomeWork01 {
    public static void main(String[] args){
        //创建丈夫对象（丈夫还没有妻子）
        Husband h = new Husband("1111","张三","2000-11-10",null);
        //创建妻子对象（妻子还没有丈夫）
        Wife w = new Wife("2222","李四","1999-4-1",null);
        //让他们两个结婚（产生关系）
        h.wife = w;
        w.husband = h;
        //输出丈夫对象的妻子名字
        //System.out.println(h.name + "的妻子是" +w.name);不符合题意
        System.out.println(h.name + "的妻子是" +h.wife.name);
        System.out.println(w.name + "的丈夫是" + w.husband.name);
    }
}
class Husband{
    //身份证号
    String idCard;
    //姓名
    String name;

    //生日
    String birthday;
    //妻子
    Wife wife;
    //无参数构造类型
    public Husband(){

    }
    //有参数构造类型
    public Husband(String s1,String s2,String s3,Wife w1){
        idCard = s1;
        name = s2;
        birthday = s3;
        wife = w1;
    }
}
class Wife{
    //身份证号
    String idCard;
    //姓名
    String name;

    //生日
    String birthday;
    //丈夫
    Husband husband;
    //无参数构造类型
    public Wife(){

    }
    //有参数构造类型
    public Wife(String s1,String s2,String s3,Husband h1){
        idCard = s1;
        name = s2;
        birthday = s3;
        husband = h1;
    }
}