package Array.homework;

public class MyStackTest {
    public static void main(String[] args) {
        //创建一个栈对象，初始化容量为10个
        MyStack stack = new MyStack();

        //调用方法压栈
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());//最后压入的。最先弹出来（符合数据结构）

        //压这个元素失败了
        stack.push(new Object());

        //弹栈
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
