package chapeter06;
/*
        使用for循环，实现1~100所有的奇数求和
        至少给出两种解决方案
 */
public class ForTest04 {
    public static void main(String[] args){
        //第一种方案：
        //思路：先找出1~10所有的奇数，然乎在考虑求和的事
        //第一步：先从1取到一百，一个数字一个数字取出来
        //第二步：既然可以求到每一个数字，进一步判断是否为奇数
        //奇数对2求余数为1
        int sum = 0;
        for(int i = 1;i <=100;i++){
            if (i % 2 == 1) {//i为奇数的条件
               // System.out.println("i = " + i);
                sum += i;//累加（sum = sum+i;)
            }
        }
        System.out.println("1~100的所有奇数和为" +sum);//2500
        //第二种方案：
        //之前的sum归0，重新求和
        sum = 0;
        for (int i = 1;i < 100;i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
}
