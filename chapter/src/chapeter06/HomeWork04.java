package chapeter06;

public class HomeWork04 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数");
        int rows = s.nextInt();

        for(int i = 1; i < rows; i++){
            for(int j = 0; j < rows - i ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
