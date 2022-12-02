package JavaBasic.Exercise;

import java.util.Scanner;

/**
 * 输入钱数，整数部分每三位加一个 逗号(Comma)
 */
public class AppendComma {
    public static void main(String[] args) {
        /**
         * 思路：1.JavaBasic.String price = Scanner
         * 2.S --> SB
         * 3.找到 . 位置 每前三位加一个Comma
         */
//        没有小数点怎么办？？？
//       最简单形式 --加一个 ，
        System.out.println("请输入价格 ");
        String price = new Scanner(System.in).next();
        StringBuffer pSB = new StringBuffer(price);
        int pos = price.lastIndexOf(".");
//        pSB.insert(pos - 3,",");
//        System.out.println(pSB);
//        扩展；以上变为循环
        //查找到的位置 - 3 之后再判断是否出界
        for (int i = price.lastIndexOf(".")-3; i > 0; i-=3) {
            pSB.insert(i,",");//在i的位置插入
        }
        System.out.println(pSB);
    }
}
