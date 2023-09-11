package chapeter13;
/*
    关于object类中的toString()方法
        1、toString(()方法的作用是什么?
        作用:将"java对象"转换成"字符串的形式"。

        2、Object类中toString(方法的默认实现是什么?
        public string toString() {
            return getClass().getName() +"@"+ Integer.toHexString (hashCode ());
            }
            toString:方法名的意思是转换成string
        含义:调用一个java对象的toString()方法就可以将该java对象转换成字符串的表示

        3、那么toString()方法给的默认实现够用吗?

 */
public class OverrideTest04 {
    public static void main(String[] args){
        //创建一个日期日期对象
        MyDate t1 = new MyDate();
        //调用toString（）方法（将方法转换成字符串形式）
        //重写MyDate的toString（）方法之前的结果
        //System.out.println(t1.toString());//MyDate@b4c966a

        System.out.println(t1.toString());//1970年1月1日
        //大家是否还记得：当输出一个引用的时候，println方法会自动调用引用的toString
        System.out.println(t1);

        MyDate t2 = new MyDate(2008,8,8);
        System.out.println(t2);//2008年8月8日
    }
}
//日期类
class MyDate{
    private int year;
    private int month;
    private int day;
    public MyDate(){
        this(1970,1,1);
    }
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //setter和getter
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    public String toString(){
        return year + "年" + month + "月" + day + "日";
    }
}