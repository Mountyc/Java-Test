package chapeter05;
/*

 */

public class OperatorTest06 {
    public static void main (String[] args){
        //定义一个年龄的变量
        int age = 35;
        //+在这里会进行字符串的拼接操作。
        System.out.println("年龄=" + age);

        int a = 100;
        int b = 200;
        //这里的+两边都是数字，所以加法运算。
        int c = a + b;
        System.out.println(c);//300

        System.out.println(a + b + "110");

        System.out.println(a + (b + "110"));

        System.out.println("100+200=300");

        System.out.println(a + "+" + b + "=" + c);

        System.out.println(a + "+" + b + "="+ a + b);

        System.out.println(a + "+" + b + "=" +(a + b));

        //在Java语言中定义字符串类型
        //int是整数型 i 是变量名 10是字面量
        //int i = 10;
        //String是字符串类型，并且String类型不属于基本数据类型范畴，属于引用类型。
        //name是变量名，只要是合法的标识符就行
        //"jack"是一个字符串型字面量
        String name = "张三";//String类型是字符串类型，其中S是大写，

        //错误：类型不兼容
        //String name = 100;

        //会进行字符串的拼接
        //System.out.println("登陆成功欢迎" + name + "回来");

        //口诀：加一个双引号"",然后双引号之间加两个加号："++",然后两个加号中间加变量名："+name+"
        System.out.println("登陆成功欢迎" + name + "回来");
        System.out.println(a +"+"+ b + "="+ c);
    }
}
