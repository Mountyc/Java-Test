package chapeter06;
/*
    计算1+2-3+4-5.....+100结果
 */
public class HomeWork02 {
    public static void main(String[] args){
        int sum = 1;
        for(int i = 2;i <=100;i++){
            if(i %2 ==0){//偶数
                sum += i;
            }else{//奇数
                sum -= i;
            }
        }
        System.out.println("sum =" +sum);
    }
}
