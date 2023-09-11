package chapeter06;
/*
        switch语句:
       1、switch语句也是选择语句，也可以叫做分支语句。
       2、switch语句的语法格式
        switch(值){
        case 值1:
            java语句;
            java语句;...
            break;
        case 值2:
            java语句;
            java语句;...
            break;
        case 值3:
            java语句;
            java语句;...
            break;
        default:
            java语句;}
        以上是一个完整的switch语句:
          其中:break;语句不是必须的。default分支也不是必须的。
        switch语句支持的值有哪些?
          支持int类型以及string类型。
        但一定要注意JDK的版本，JDK8之前不支持string类型，只支持int.
        在JDK8之后，switch语句开始支持字符串string类型。
        switch语句中"值"与"值1"、"值2"比较的时候会使用"=="进行比较。
        3、switch语句的执行原理
          拿"值"与"值1"进行比较，如果相同，则执行该分支中的java语句，
          然后遇到"break:"语句，switch语句就结束了。

          如果"值"与"值1"不相等，会继续拿"值"与"值2"进行比较，如果相同，
          则执行该分支中的java语句，然后遇到break;语句，switch结束。
          注意:如果分支执行了，但是分支最后没有"break:"，此时会发生case穿透现象。

          所有的case都没有匹配成功，那么最后default分支会执行。
 */
public class SwitchTest01 {
    public static void main (String[] args){
        //分析这个程序是否能够编译通过?
        //switch只支持int和String类型
        //错误：类型不兼容:从long转到int可能会损失
        /*
        long x = 100L;
        switch(x){

        }
         */
        /*
        long x = 100L;
        switch ((int)x){

        }
        byte b = 100;
        switch(b){

        }
        short s = 100;
        switch(s){

        }
        char c = 100;
        switch(c){

        }
        char c = 'a';
        switch(c){

        }
         */
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入[0~6]数字");
        int num = s.nextInt();
        switch(num){
            case 0:
                System.out.println("星期日");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
        }
    }
}
