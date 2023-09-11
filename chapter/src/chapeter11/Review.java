package chapeter11;
/*
    到目前为止一个类当中可以出现的:
        类体{
        实例变量;
        实例方法;

        静态变量;
        静态方法;

        构造方法;

        静态代码块;
        实例语句块;

        方法(){
        // 局部变量
        int i=100;

 */
public class Review {//类
    //入口
    //静态方法
    public static void main(String[] args){
        //局部变量
        int i = 100;
        //完成一个对象的一连串动作
        //
        student02 s1 = new student02();
        s1.study();
        student02 s2 = new student02();
    }
}
class student02{
    //类加载机制中，是这样的：在程序执行前，凡是需要加载的类全部加载到JVM当中
    //先完成类加载才会执行main方法
    static {
        System.out.println("Review类加载时执行！");
    }
    //学号
    private int no;//实例变量
    //姓名
    private String name;
    //岗位
    static String job = "学习";
    {
        System.out.println("实例语句块，构造方法执行一次，这里就执行一次！");
    }
    //构造方法
    public student02(){
        this(100,"张三");
    }
    public student02(int no,String name){
        this.no = no;
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public int getNo() {
        return no;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //提供两个实例方法
    public void study(){
        /*
        System.out.println(this.name +"正在努力学习");
        System.out.println(name +"正在努力学习");
        System.out.println(getName() +"正在努力学习");
        */
        System.out.println(this.getName() +"正在努力学习");
        //执行到此处表示学习完去吃饭
        this.eat();
    }
    public void eat(){
        System.out.println(this.getName() +"去餐厅吃饭！");
        //调用静态m1（）"类名.“
        student02.m1();
        m2();
    }

    //提供两个静态方法
    public static void m1(){
        System.out.println("student02's m1 method execute!");
    }
    public static void m2(){
        System.out.println("student02's m2 method execute!");
        System.out.println("工作性质：" + job);
        //System.out.println("工作性质：" + student02.job);
    }

}