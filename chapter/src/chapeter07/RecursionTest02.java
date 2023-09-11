package chapeter07;

public class RecursionTest02 {
    public static void main(String [] args){
        int n = 5;
        int r = sum(n);
        System.out.println(r);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n * sum(n-1);
    }
}
