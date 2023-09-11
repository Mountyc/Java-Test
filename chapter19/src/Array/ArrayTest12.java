package Array;
/*
    动态初始化二维数组
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        //3行4列
        //3个一维数组，每一个一维数组当中4个元素
        int[][] array = new int[3][4];
        /*
        //二维数组遍历

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

         */
        //静态初始化
        int[][] a ={{1,2,3,4},{5,6,8,99}, {1,22,55}};
        printArray(a);

        //没有这种语法
        //printArray({{1,2,3,4}, {5,6,8,99},{1,22,55}});

        //可以这样写
        printArray(new int[][]{{1,2,3,4}, {5,6,8,99},{1,22,55}});
    }
    public static void printArray(int[][] array) {
        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
