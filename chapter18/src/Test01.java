/*
    关于object类中的toString()方法
        1、源代码长什么样?
        public string toString() {
            return this.getClass().getName() +"@"+ Integer.toHexString(hashCode());
            }
        源代码上toString()方法的默认实现是:
        类名@对象的内存地址转换为十六进制的形式

        2、SUN公司设计toString()方法的目的是什么?
        toString()方法的作用是什么?
        toString()方法的设计目调用这个方法可以将一个"java对象”转换成"字

        3、其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
        toString()方法应该是一个简洁的、详实的、易阅读的.

 */
public class Test01 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(1970,1,1);
        //一个日期对象转换成字符串形式的话，我可能希望能看到具体的日期信息。
        String s1 = t1.toString();

        //MyTime类重写toString()方法之前
        System.out.println(s1);//MyTime@27d6c5e0
        System.out.println(s1);
    }
}
class MyTime{
    int year;
    int month;
    int day;
    public MyTime(){

    }
    public MyTime(int year,int month,int day){
        this.year = year;
        this.month =month;
        this.day = day;
    }

    //重写toString()方法
    //这个toString()方法怎么重写呢？
    //越简洁越好，可读性越好。
    //向简洁的、详细的、易阅读的方向发展

       // return this.year +'年'+this.month+'月'+this.day+'日';


    @Override
    public String toString() {
        return super.toString();
    }

    //重写Object类的equals方法
    //复制粘贴。相同的返回值类型、相同的方法名。相同的形式参数列表。
    @Override
    public boolean equals(Object obj) {
        return (this== obj);
        //当年相同，月相同，并且日相同的时候，表示两个日期相同。两个对象相等。
        //.............
        //获取第一个日期

    }
}