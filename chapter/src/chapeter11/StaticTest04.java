package chapeter11;

public class StaticTest04 {
    public static void main(String[] args){
        //这是比较正规的方式，静态方法采用"类名."
        StaticTest04.doSome();

        //对象
        StaticTest04 st = new StaticTest04();
        //用“引用.”访问
        st.doSome();

        //空引用
        st = null;
        //不会出现空指针异常
        st.doSome();

        //实例方法doOther（）
        //对象级别的方法（先new对象，通过“引用."来访问）
        //StaticTest04.doOther();

        StaticTest04 st2 = new StaticTest04();
        st2.doOther();
        //空引用
        st2 = null;
        //st2.doOther();
    }

    //静态方法（静态方法不需要new对象，直接使用”类名."来访问）
    //但是也可以使用“引用."来访问，不建议使用。（因为其他的程序员看不懂）
    public static void doSome(){
        System.out.println("静态方法doSome执行了！");
    }

    //实例方法（实例相关的方法都需要new对象，使用”引用."来访问。）
    public void doOther(){
        System.out.println("实例方法doOther执行了！");
    }
}
