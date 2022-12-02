package JavaBasic.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
//        用来表示精度极高的小数
        BigDecimal bigDecimal = new BigDecimal("18.555555555" +
                "555555555555555555");
        BigDecimal bigDecimal2 = new BigDecimal("45.11111111111" +
                "111111111111111111111");
        //运算
        BigDecimal add = bigDecimal.add(bigDecimal2);
        System.out.println(add);
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        System.out.println(subtract);
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        System.out.println(multiply);
//        BigDecimal divide = bigDecimal.divide(bigDecimal2);
//        System.out.println(divide);//可能会报错
//        原因：当除完一个数时是一个无限不循环的小数时会报错
//        解决办法：设定小数位数
        BigDecimal divide = bigDecimal.divide(bigDecimal2,
                BigDecimal.ROUND_CEILING);
        System.out.println(divide);
        //  会根据除数的小数点后几位设定商的小数点位数

    }
}
