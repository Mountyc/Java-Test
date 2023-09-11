package chapeter14;
/*
    通过这个测试得出的结论：
        super 不是引用。super也不保存内存地址，super也不能指向任何对象
        super 只是代表当前对象内部的那一块夫类型的特征。
 */
public class SuperTest04 {
    //实例方法
    public void doSome(){
        //chapeter14.SuperTest06@10f87f48
        System.out.println(this);
        //输出“引用.”的时候，会自动调用引用的toString（）方法。
        //System.out.println(this.toString());

        //编译错误：需要‘.'
        //System.out.println(super);
    }
    //this和super不能使用在static静态方法中
    /*
    public static void doOther(){
        System.out.println(this);
        System.out.println(super.xxx);
    }

     */
    //静态方法，主方法
    public static void main(String [] args){
        SuperTest04 st = new SuperTest04();
        st.doSome();
    }
}
