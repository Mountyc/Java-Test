package chapeter06;
/*

 */
public class HomeWork01{
    public static void main(String[] args){
        int sum =0;
        for(int i = 1;i <= 1000;i++){
            //System.out.println(i);
            if (i % 7 != 0){
                sum += i;
            }
        }
        System.out.println("sum =" + sum);
    }
}
