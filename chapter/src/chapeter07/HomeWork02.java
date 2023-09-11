package chapeter07;
/*
编写一个方法，输出大于某个正整数n的最小的质数
比如:这个正整数n是2
也就是要输出:大于2的最小的质数，结果就是3
比如:这个正整数n是9
也就是要输出:大于9的最小的质数，结果就是11
大于11的最小的质数是:13
思路:
首先，系统一定会先给你一个"正整数n"，然后你基于这个n往后++，每加1得到的新数m判断一下是否为质数。
*/
public class HomeWork02 {
    public static void main(String[] args){
    /*
        //假设系统目前给了一个正整数n，n为5
        int n = 5;
        //请找出大于五的最小质数
        while(true){
            n++;//n自加1
            //判断此时的n是否为质数
            boolean flag = isZhiShu(n);
            if(flag){
                System.out.println(n);
                break;
            }
        }

     */
        printZuiXiaoZhiShu(10);
    }
    public static void printZuiXiaoZhiShu(int n) {
        while (true) {
            n++;//n自加1
            //判断此时的n是否为质数
            boolean flag = isZhiShu(n);
            if (flag) {
                System.out.println(n);
                break;
            }
        }
    }

    //专门的定义一个方法，来判断某个数是否为质素
    //这个方法的形参是：被判断的数字num
    //这个方法的返回值类型true为质数，false非质数
    public static boolean isZhiShu(int num){
        for (int i = 2;i < num;i++){
            if(num % 2 ==0){
                return false;
            }
        }
        return true;
    }
}
