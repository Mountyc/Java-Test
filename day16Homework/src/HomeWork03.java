public class HomeWork03 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.disPlay();

        MyTime t2 = new MyTime(13,20,30);
        t2.disPlay();

        t2.addSecond(5);
        t2.disPlay();
    }
}
class MyTime{
    private int hour;
    private int minute;
    private int second;
    public MyTime(){

    }
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    /*加秒*/
    public void addSecond(int sec){
        //原来秒上加
        //this.setSecond(this.getSecond() + sec);
        //再往下编程，和数学有关
        int oldSec = this.getSecond();
        int newSec = oldSec + sec;
        if (newSec < 60){
            //总的秒速小于六十
            this.setSecond(newSec);
        } else if (newSec ==60) {
            //总秒数刚好等于60
            this.addMinute(1);
            this.setSecond(0);
        }else {
            //总秒数大于六十
            int newMin = newSec;
            this.addMinute(newMin);
            this.setSecond(newSec % 60);
        }
    }
    /*加分*/
    public void addMinute(int min){
        int oldMin = this.getMinute();
        int newMin = oldMin + min;
        //这里没有处理
        this.subMinute(newMin);
    }
    /*加时*/
    public void addHour(int hou){}
    /*减秒*/
    public void subSecond(int sec){}
    /*减分*/
    public void subMinute(int min){}
    /*减时*/
    public void subHour(int hou){}
    public void disPlay(){
        //System.out.println(this.hour + "时" + this.minute + "分" + this.second + "秒");
        System.out.println(this.getHour() + "时" + this.getMinute() + "分" + this.getSecond() + "秒");

    }
}
