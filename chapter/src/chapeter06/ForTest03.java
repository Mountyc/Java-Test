package chapeter06;

public class ForTest03 {
    public static void main(String[] args){
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);//10 9 8 7 6 5 4 3 2 1
        }
        //变形
        for (int i = 0; i < 10; i += 2){
            System.out.println("valuer = " + i);//0 2 4 6 8
        }
    }
}
