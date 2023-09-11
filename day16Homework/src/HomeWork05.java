public class HomeWork05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(20);
        p1.display();

        Person p2 = new Person("李四",30);
        p2.display();

        Person p3 = new Person();
        p3.display();
    }
}
class Person{
    public void display(){
        //System.out.println("姓名：" + this.getName() + ",年龄：" + this.getAge());
        System.out.println("姓名：" + name + ",年龄：" + age);
        //System.out.println("姓名：" + this.name + ",年龄：" + this.age);

    }
    private String  name;
    private int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}