package Array;
/*

关于二维数组中元素的:读和改。

    a[二维数组中的一维数组的下标][一维数组的下标]

    a[0][0]:表示第1个一维数组中的第1个元素。

    a[3][100]:表示第4个一维数组中的第101个元素。

注意:对于a[3][100]来说，其中a[3]是一个整体。[100]是前面a[3]执行结束的结果然后再下标100
*/

public class ArrayTest10 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {
            {34,4,25},
                {22,34,78},
                {0},
        };
        //请取出以上二位数组中的第一个一维数组
        int[] x = a[0];
        int x1 = x[0];
        System.out.println(x1);

        //以下代码的由来是因为以上代码的合并导致
        System.out.println(a[0][0]);
        //取出第二个一维数组当中第三个元素
        System.out.println(a[1][2]);
        //取出第三个一维数组当中的第一个元素
        System.out.println(a[2][0]);

        //改
        a[2][0] = 1111;
        System.out.println(a[2][0]);

        //注意别越界
    }
}
