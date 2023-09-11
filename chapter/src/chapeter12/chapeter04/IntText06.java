package chapeter12.chapeter04;

public class IntText06 {
    public static void main (String[] args){
        long a = 10L;
        char c = 'a';
        short s = 100;
        int i = 30;
        //求和
        System.out.println(a + c + s + i);//237

        //错误：不兼容的类型：从long转换到int可能会有损失
        //计算结果是long类型
        //int x = (int)(a + c + s + i);

        int x = (int)(a + c + s + i);
        System.out.println(x);

        //java中规定，int类型和int类型最终结果还是int类型
        int temp = 10 / 3; // /是除号（取最终结果）
        System.out.println(temp);

        //在Java中计算结果不一定是精确的
        int temp2 = 1 / 2;
        System.out.println(temp2);// 0
    }

}
