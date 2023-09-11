package chapeter11;
/*
    1.this除了可以使用在实例方法中，也可以在构造方法中

    2.新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下格式：
        this（实际参数列表）；
        通过一个构造方法1去调用构造方法2，可以做到代码复用。
        但需要注意的是：”构造方法1“和“构造方法2”必须在同一个类当中。

     3.this（）这个语法作用是什么？
        代码复用

     4.死记硬背：
        对于this（）的调用只能出现在构造方法的第一行。
 */
public class ThisTest04 {
    public static void main(String[] args){
        //调用无参数方法
        Date d1 = new Date();
        d1.detail();

        //调用有参数方法
        Date d2 = new Date(2008,8,8);
        d2.detail();
    }
}
class Date{
    //年
    private int year;
    //月
    private int month;
    //日
    private int day;
    //构造方法无参
    public Date(){
        /*
        this.year = 1970;
        this.month = 1;
        this.day = 1;

         */
        this(1970,1,1);
    }
    //构造有参方法
    public Date(int year,int month, int day){
        this.year = year;
        this.month  = month;
        this.day = day;
    }
    //提供一个可以打印日期的方法
    public void detail(){
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
}