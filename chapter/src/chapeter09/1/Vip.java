package chapeter09;

public class Vip {
    // 会员号
    long no;
    // 会员姓名
    String name;
    // 生日
    String birth;
    // 性别
    boolean sex;
    // 无参数构造方法
    public Vip(){

    }
    // 有参数构造方法
    public Vip(long huiYuanHao,String xingMing){
        //给实际变量赋值【初始化实例变量，初始化属性】
        no = huiYuanHao;
        name = xingMing;
        //实际上这里有两行代码（没有手动赋值，系统会默认赋值）
        //birth = null;
        //sex = shengRi;
    }
    // 有参数构造方法
    public Vip(long huiYuanHao,String xingMing,String shengRi){
        no = huiYuanHao;
        name = xingMing;
        birth = shengRi;
        //实际上这里有一行默认代码
        //sex = false;
    }
    public Vip(long huiYuanHao,String xingMing,String shengRi,boolean xingBie){
        no = huiYuanHao;
        name = xingMing;
        birth = shengRi;
        sex = xingBie;
    }
}
