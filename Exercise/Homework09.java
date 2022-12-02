package JavaBasic.Exercise;

public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("清明雨上","5分钟");
        music.getinfo();


    }
}

class Music {
    String name  ;//音乐名
    String times  ;//音乐时长
    public void play(String name){
        System.out.println("播放音乐"+name);

    }
    public Music(String name,String times){
        this.name = name;
        this.times = times;


    }
    public void getinfo(){
        System.out.println("该首歌的属性如下：");
        System.out.println("名称为"+name+","+"音乐时长为"+times);
    }
}