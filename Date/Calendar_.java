package JavaBasic.Date;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
//        Calendar类是一个抽象类，且其无参构造器是私有的，需调用getInstance()
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //字段非常多，仅获取相关的字段就可以了
        //分别获得字段
        System.out.println("年："+c.get(Calendar.YEAR));
        //MOUTH字段从 0 开始
        System.out.println("月："+c.get(Calendar.MONTH) + 1 );
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时："+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+c.get(Calendar.MINUTE));
        System.out.println("秒："+c.get(Calendar.SECOND));
        //Calendar没有特定的格式，需要自己指定
        System.out.println("当前时间:"+c.get(Calendar.YEAR)+"-"+
                (c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH)
        +" "+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"
                +c.get(Calendar.SECOND));

    }
}

