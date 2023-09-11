package chapeter11;

public class HomeWork02 {
    public static void main(String[] args){
        //创建Book对象
        Book b1 = new Book("高三数学人教版",250);
        //调用detail方法
        b1.detail();
        //修改页数
        b1.setPageNUm(100);
        b1.detail();
    }
}
class Book{
    //名称
    private String title;
    //页数
    private int pageNUm;
    public Book(){

    }
    public Book(String s,int p){
        title = s;
        pageNUm = p;
    }
    //setter and getter方法
    public void setTitle(String s){
        title = s;
    }
    public String getTitle(){
        return title;
    }
    public void setPageNUm(int p){
        if (p < 200){
            System.out.println("本书的页数不够200，默认赋值200");
            pageNUm = 200;
            return;
        }
        pageNUm = p;
    }

    public int getPageNUm() {
        return pageNUm;
    }
    //额外提供一个detail方法
    public void detail(){
        System.out.println("教程名称" + title + ",总页数为" + pageNUm);
    }
}