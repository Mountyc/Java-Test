package chapeter13;
/*
    这个代码的疑问？
        肉眼可以观察到底是new Bird（）还是new Cat（）！！
        为什么还要进行instanceof判断

        原因是：
        以后可能肉眼看不到。
 */
public class Test02 {
    public static void main(String[] args){
        Animal02 x = new Cat02();
        Animal02 y = new Bird02();

        if (x instanceof Bird02){
            Bird02 b = (Bird02) x;
            b.sing();
        } else if (x instanceof Cat02) {
            Cat02 c = (Cat02) x;
            c.catchMouse();
        }
        if (y instanceof Bird02){
            Bird02 b = (Bird02) y;
            b.sing();
        }else if (y instanceof Cat02){
            Cat02 c = (Cat02) y;
            c.catchMouse();
        }
    }
}
