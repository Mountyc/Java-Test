package chapeter07;

public class HomeWork01 {
    public static void main(String[] args){
        /*
        计算5的阶乘
        int n = 5;
        int result = 1;
        for(int i = 0;i > 1;i--){
            //System.out.println(i);
            //result = result * i;
            result *= i;
        }
        System.out.println(result);
         */
        //调用方法计算阶乘
        //提取一个方法出来，这个方法专门来计算某个数的阶乘
//这个数不一定是5，可能是其他的值，可能是6，也可能是7，不确定
//像这种不确定的数据，对于方法来说我们就可以定义为:形参。(形参类型定义为int）
// 该方法是为了完成阶乘的，最终是需要一个计算结果的，所以该方法应该有返回值。
// 将最后的结果返回给调用方。谁调用我，我就返回给谁。返回值类型定义为int
// 我这个方法可以计算任何数的阶乘。
        int result1 = jieCheng(5);
        System.out.println(result1);

        int result2 = jieCheng(6);
        System.out.println(result2);
    }
    public static int jieCheng(int n){
        int result = 1;
        for (int i = n;i > 1;i--){
            result *= i;
        }
        return result;
    }
}
