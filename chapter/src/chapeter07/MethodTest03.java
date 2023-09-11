package chapeter07;

public class MethodTest03 {
    public static void main(String[] args){
        //调用方法
        int result = m3();
        System.out.println(result);

        //调用x方法
        int result1 = x(true);
        System.out.println("result1 = " + result1);

        int result2 = x(false);
        System.out.println("result2 = " + result2);
    }
    /*
    //缺少返回语句
    public static int m(){
        boolean flag = true;//编译器不运行程序，只讲道理
        //对于编译器来说，编译器只知道flag变量是boolean类型
        //编译器会认为flag有可能是false，有可能是true
        if (flag){
            return 1;
        }
    }

     */
    public static int m1(){
        boolean flag = true;//编译器不运行程序，只讲道理
        //对于编译器来说，编译器只知道flag变量是boolean类型
        //编译器会认为flag有可能是false，有可能是true
        if (flag){
            return 1;
        }else{
            return 0;
        }
    }
    public static int m2(){
        boolean flag = true;//编译器不运行程序，只讲道理
        //对于编译器来说，编译器只知道flag变量是boolean类型
        //编译器会认为flag有可能是false，有可能是true
        if (flag){
            return 1;
        }
        return 0;
    }
    //三目运算符
    public static int m3(){
        boolean flag = true;
        return flag ? 1 : 0;
    }
    //带一个参数的方法
    public static int x(boolean flag){
        return flag ? 1 : 0;
    }
}
