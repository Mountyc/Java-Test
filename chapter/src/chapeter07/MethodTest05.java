package chapeter07;

public class MethodTest05 {
    public static void main(String[] args){
        //调用sum方法
        int result = sum(10,20);//30
        System.out.println(result);

        //上面两行代码合并为一行
        System.out.println(sum(100,200));//300

        System.out.println(m());//true
    }
    public static boolean m(){
        return true;
    }
    public static int sum(int a,int b){
        return a + b;
    }

}
