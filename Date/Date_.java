package JavaBasic.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        //输出当前时间
        Date date = new Date();
        System.out.println(date);
        //输出距离1970-1-1 多长毫秒的时间
        Date date2 = new Date(198254256);
        System.out.println(date2);
        //格式化时间（换成中国人习惯）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(date);
        System.out.println(format);

        //将String --> JavaBasic.Date
        //注意：输入的字符串格式须跟 sdf设定的格式相同
        String s = "2022年11月20日 15:03:05 星期日";
        Date parse = sdf.parse(s);//需要抛个异常
        System.out.println(parse);


    }
}
