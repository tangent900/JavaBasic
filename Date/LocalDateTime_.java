package JavaBasic.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ldfDate = LocalDate.now();
        System.out.println(ldfDate);
        LocalTime ldfTime = LocalTime.now();
        System.out.println(ldfTime);

        System.out.println("年"+ldt.getYear());
        System.out.println("月"+ldt.getMonth());//显示英文月份
        System.out.println(ldt.getMonthValue());//阿拉伯数字
        System.out.println("日"+ldt.getDayOfMonth());
        System.out.println("时"+ldt.getHour());
        System.out.println("分"+ldt.getMinute());
        System.out.println("秒"+ldt.getSecond());

//        对LocalDateTime进行格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd " +
                "HH:mm:ss");
        String formate = dtf.format(ldt);
        System.out.println(formate);

        //        2.plus  and minus 看多长时间前/ 后 是什么时间
        LocalDateTime ldfp = ldt.plusDays(800);
        
        String formate2 = dtf.format(ldfp);
        System.out.println("800天之后为："+formate2);

        LocalDateTime ldtm = ldt.minusMinutes(80000);
        String format3 = dtf.format(ldtm);
        System.out.println("80000分钟之前为："+format3);


    }

}
