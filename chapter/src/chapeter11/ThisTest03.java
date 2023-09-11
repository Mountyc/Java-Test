package chapeter11;

public class ThisTest03 {
    public static void main(String[] args){
        Student01 s = new Student01();
        s.setName("张三");
        s.setNo(111);
        System.out.println("学生姓名" + s.getName());
        System.out.println("学号" + s.getNo());
    }
}
//学生类
class Student01{
    private int no;
    private String name;
    public Student01(){

    }
    public Student01(int no,String name){
        this.no = no;
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}