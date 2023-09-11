package Array;

/*
选择排序：
    每一次从这堆参与比较的数据中“找出最小值”
    拿着这个最小值和参与比较的这堆最前面的元素“交换位置。
    
    选择排序比冒泡排序好在：每一次的交换位置都是有意义的。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 2 };
        //int count = 0;

        //选择排序
        //五条数据循环4次。（外层循环4次）
        for (int i = 0; i < arr.length - 1; i++) {
            //i的值是0 1 2 3
            //i正好是”参加比较的这堆数据中最左边那个元素的下标。
            //System.out.println(i);
            //i是一个参与比较这堆数据中的起点下标。
            //假设起点i下标位置上的元素是最小的
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                //System.out.println("====>" + j);
                if (arr[j] < arr[min]) {
                    min = j;//最小值下标为j
                }
            }
            //当i和min相等时，表示最初的猜测是对的
            //当i和min不相等时，表示最初的猜测是错的，有比这个元素更小的元素
            //需要拿着这个更小的元素和最左边的元素交换位置
            if (min != i) {
                //表示存在更小的数据
                //arr[min]更小的数据
                //arr[i]最前面的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        //排序后遍历
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
