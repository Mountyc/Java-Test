public class HomeWork2 {
    public static void main(String[] args) {
        //无参数构造方法创建对象
        Vehicle v = new Vehicle();
        //通过set方法给属性赋值
        v.setSpeed(0);
        v.setSize(5);

        v.move();

        //有参数构造方法创建对象
        // Vehicle v1 = new Vehicle(120,5);
        System.out.println("Speed ：" + v.getSpeed());
        System.out.println("size :" + v.getSize());

        //调用加速方法
        v.speedUp(10);
        System.out.println("Speed :" + v.getSpeed());


        //调用减速方法
        v.speedDown(10);
        System.out.println("Speed :" + v.getSpeed());
    }
}
/*交通工具
 */
class Vehicle {
    //速度
    private int speed;
    // 体积
    private int size ;
    public Vehicle(){}
    public Vehicle(int speed ,int size){
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }
    //设置速度的方法

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //交通工具的移动方法
    public void move(){
        System.out.println("交通工具：公共汽车，起步行驶。");
    }
    //加速方法
    public void speedUp(int addSpeed){
        //在原来速度的基础之上加
        //this 就是当前的交通工具对象
        int oldSpeed = this.getSpeed();//原来的速度
        this.setSpeed(oldSpeed + addSpeed);
    }
    //减速方法
    public int speedDown(int subSpeed){
        //在原来的基础之上减去
        //最好有判断
        int oldSpeed = this.getSpeed();
        if (oldSpeed - subSpeed <= 0){
            System.out.println("公共汽车停止");

        } else {
            this.setSpeed(oldSpeed - subSpeed);
        }
        return oldSpeed;
    }

}
