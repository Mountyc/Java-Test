package chapeter06;
/*
5*4*3*2*1 阶乘
 */
public class HomeWork03 {
    public static void main(String[] args){
        //从键盘接收一个正整数
        java.util.Scanner s = new java.util.Scanner(System.in);
        //输入一个正整数
        System.out.print("请输入一个正整数");
        int num = s.nextInt();
        //计算阶乘
        //先实现递减，不管阶乘
        int result = 1;
        for(int i = num;i > 1;i--){
            result *= i;//result = result * i ;
        }
        System.out.println("结果为 =" +result);
    }
}
