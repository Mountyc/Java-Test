package Array;

public class ArraySearch {

    public static void main(String[] args) {

        //举个例子演示一下第一种方式
        int[] arr = {8, 7, 6, 87, 99};

        //需求：找出87的下标。如果没有返回-1
        //一个一个挨着找
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 87){
                System.out.println("87元素的下标为" + i);
                return;
            }
        }
        //程序执行到此处，表示没有87
        System.out.println("87元素不存在");
        */
        int index = arrSearch(arr, 87);
        System.out.println(index == -1 ? "该元素不存在" : "该元素小标是" + index);
    }

    /**
     * 从数组中检索某个元素的下标（返回第一个元素的下标）
     * @param arr 被检索的数组
     * @param ele 被检索的元素
     * @return 大于等于0的数表示元素的下标，-1表示该元素不存在
     */
        public static int arrSearch ( int[] arr, int ele){
            for (int i = 0; i < arr.length; i++) {
                if (ele == arr[i]) {
                    return i;
                }
            }
            return -1;
    }
}
