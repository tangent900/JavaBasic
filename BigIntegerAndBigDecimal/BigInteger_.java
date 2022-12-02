package JavaBasic.BigIntegerAndBigDecimal;

import  java.math.BigInteger;
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("88887888888888888888888888888");
        System.out.println(bigInteger);
        BigInteger bigInteger2 = new BigInteger("1000000000000000000000000000000000");
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//加
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//除以



    }
}
