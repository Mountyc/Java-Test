/*
    关于object类中的equals方法
        1、equals方法的源代码
            public boolean equals(Object obj){
            return(this==obi);
            }
        以上这个方法是object类的默认实现。

        2、SUN公司设计equals方法的目的是什么?
        以后编程的过程当中，都要通过equals方法来判断两个对象是否相等。
        equals方法是判断两个对象是否相等的。

        3、我们需要研究一下object类给的这个默认的equals方法够不够用!!!!
            在object类中的equals方法当中，默认采用的是"=="判断两个java对象是否相等。
            而"=="判断的是两个java对象的内存地址，我们应该判断两个java对象的内容是否相等。
            所以老祖宗的equals方法不够用，需要子类重写equals。

        4、判断两个java对象是否相等，不能使用"=="，因为"=="比较的是两个对象的内存地址。
 */
public class Test02 {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等直接使用“==”就行。
        int a = 100;
        int b = 100;
        System.out.println(a==b);//true相等，false不相等

        //判断两个java对象是否相等，我们怎么办？能直接用==吗？
        //创建一个日期对象是：2008年8月8日
        MyTime02 t1 = new MyTime02(2008,8,8);//MyTime t1 =0x1234
        //创建一个新日期对象也是：2008年8月8日
        MyTime02 t2 = new MyTime02(2008,8,8);//MyTime t2 =0x3456

        //测试以下，比较两个对象是否相等，能不能使用“==”
        //这里的“==”判断的是：t1中保存的对象内存地址和t2中保存的对象内存地址是否相等。
        System.out.println(t1==t2);//false
        //重写Object equals方法后（比较的是对象的内存地址）
        /*
        boolean flag = t1.equals(t2);
        System.out.println(flag);//false
         */

        //重写Object equals方法后（比较的是内容。）
        boolean flag = t1.equals(t2);
        System.out.println(flag);//true

        //在创一个新的日期
        MyTime02 t3 = new MyTime02(2008,8,9);
        //两个日期不相等
        System.out.println(t1.equals(t3));//false

        //效率低改造
        MyTime02 t4 = null;
        System.out.println(t1.equals(t4));//false
    }

}
class MyTime02 {
    int year;
    int month;
    int day;

    public MyTime02() {

    }

    public MyTime02(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写Object类的equals方法
    //复制粘贴。相同的返回值类型、相同的方法名。相同的形式参数列表。
    /*
    public boolean equals(Object obj) {

        //当年相同，月相同，并且日相同的时候，表示两个日期相同。两个对象相等。
        //.............
        //获取第一个日期
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
        //获取第二个日期
        /*
        int year2 = obj.year;
        int month2 = obj.month;
        int day2 = obj.day;
         */
    /*
        if (obj instanceof MyTime02){
            MyTime02 t = (MyTime02) obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if(year1 == year2 && month1 == month2 && day1 ==day2){
                return true;
            }
        }
        //程序执行到这表示日期不相等。
        return false;
    }
    }
     */
    /*
    //程序改良
    public boolean equals(Object obj) {
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
        //如果obj为空直接返回false
        if (obj == null) {
            return false;
        }
        //如果obj不是一个MyTime，没必要比较。直接返回false
        if (!(obj instanceof MyTime02)) {
            return false;
        }
        //如果this和obj保存的内存地址相同，直接返回true。
        //内存地址相同的时候指向的堆内存的对象肯定是同一个
        if (this == obj) {
            return true;
        }
        //程序能执行到此处说明obj不是null，obj是MyTime类型
        MyTime02 t = (MyTime02)obj;
        int year2 = t.year;
        int month2 = t.month;
        int day2 = t.day;
        if(year1 == year2 && month1 == month2 && day1 ==day2){
            return true;
        }
        //程序执行到这里返回false
        return false;
    }

     */
    /*
    //再次改良
    public boolean equals(Object obj) {

        //如果obj为空直接返回false
        if (obj == null) {
            return false;
        }
        //如果obj不是一个MyTime，没必要比较。直接返回false
        if (!(obj instanceof MyTime02)) {
            return false;
        }
        //如果this和obj保存的内存地址相同，直接返回true。
        //内存地址相同的时候指向的堆内存的对象肯定是同一个
        if (this == obj) {
            return true;
        }
        //程序能执行到此处说明obj不是null，obj是MyTime类型
        MyTime02 t = (MyTime02)obj;

        return this.year == t.year && this.month == t.month && this.day ==t.day;
    }
     */
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof MyTime02)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        MyTime02 t = (MyTime02)obj;
        return this.year == t.year && this.month == t.month && this.day ==t.day;
    }
}
