package chapeter013;
//测试多态在开发中的作用
public class Test {
    public static void main(String[] args){
        //创建主人对象
        Master zhangSan = new Master();
        //创建宠对象
        Dog zangAo = new Dog();
        //主人喂
        zhangSan.feed(zangAo);
        //创建宠物对象
        Cat xiaoHua = new Cat();
        //主人喂
        zhangSan.feed(xiaoHua);
        //创建宠物对象
        YingWu yingWu = new YingWu();
        //主人喂
        zhangSan.feed(yingWu);
    }

}
