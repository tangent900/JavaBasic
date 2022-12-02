package JavaBasic.Date;

import java.util.Date;
import java.time.Instant;
public class Instant_ {
    public static void main(String[] args) {
        //        Instance 时间戳
//        1.Instance 与 JavaBasic.Date 类型的相互转换

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        Date nowDate = Date.from(nowInstant);

        java.time.Instant instant2 = nowDate.toInstant();



    }
}
