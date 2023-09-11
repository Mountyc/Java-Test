package chapeter11;

public class CodeOrder {
    static {
        System.out.println("A");
    }

    public static void main(String[] args){
        System.out.println("Y");
        new CodeOrder();
        System.out.println("Z");
    }

    public CodeOrder(){
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("X");
    }

}
