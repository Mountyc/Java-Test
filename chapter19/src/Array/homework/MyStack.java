package Array.homework;

public class MyStack {
    private Object[] elements;

    //栈帧，永远指向栈顶部元素
    //那么这个默认值应该是多少。注意：最初的栈是空的，一个元素也没有。
    //private int index = 0;//如果index 采用0，表示栈帧指向了顶部元素的上方
    //private int index = -1;//如果index 采用-1，表示栈帧指向了顶部元素
    private int index;

    /*
    无参数构造方法。默认初始化栈为10
     */
    public MyStack() {
        //一维数组动态初始化
        //默认初始化容量10
        this.elements = new Object[10];
        this.index = -1;
    }

    /**
     * 压栈的方法
     * @param obj 被压入的元素
     */
    public void push(Object obj){
        if(index >= elements.length -1){
            System.out.println("压栈失败，栈已满");
            return;
        }
        //程序能走到这说明栈没满
        //向栈中加一个元素，栈帧向上移动一个位置。
        index++;
        elements[index] = obj;
        //在声明一次：所有的System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString（）方法
        System.out.println("压栈" +obj+ "元素成功，栈帧指向"+index);
    }
    public Object pop(){
        if(index < 0){
            System.out.println("弹栈失败，栈已空！");
            return null;
        }
        //程序能走到这说明栈没空
        System.out.println("弹栈" + elements[index] + "元素成功，");
        index--;
        System.out.println("栈帧指向" + index);
        return index;
    }
    //set和get也许用不上，但必须写上，这是规矩。你使用idea生成就行
    //封装：第一步：属性私有化，第二步：对外提供set和get方法
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
