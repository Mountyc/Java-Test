package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java中对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间(精确到毫秒的系统当前时间)
        //直接调用无参数构造方法就行
        Date nowTime = new Date();

        //java.util.Date类的toString（）方法已经被重写了
        //输出的应该不是一个对象的内存地址，应该是一个日期字符串
        //System.out.println(nowTime);//Sat Jun 24 18:23:21 CST 2023

        // 日期可以格式化吗？
        // 将日期类型Date，按照指定的格式化进行转换：Date --转换成具有一定格式的日期字符串-->String
        // SimpleDateFormat是Java.text包下的专门负责日期格式化的。
        /*
        yyyy 是年（年是四位）
        MM   月（月是两位）
        dd   日
        HH   时
        mm   分
        ss   秒
        SSS  毫秒（毫秒是三位，最高是999）
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")；

        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        //假设现在有一个日期字符串String ，怎么转换成Date类型？
        //String --> Date
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        //注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然会出现异常：java.text.ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);//Fri Aug 08 08:08:08 CST 2008
    }
}
