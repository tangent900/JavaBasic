/*
    猜拳
    0 石头  1 剪刀 2 布
    电脑每次随机生成 0，1 ，2，并统计Tom输赢的次数
    思路：定义方法  public void CaiQuan(int i次数)
    输出Tom输赢次数
     循环i次随机数生成两个数（范围：012），mn表示，m表示Tom
    当赢一次： y+1；输的次数 i  - y

 */
package JavaBasic.Exercise;

import java.util.Random;

public class Homework14 {
    public static void main(String[] args) {
        Method method = new Method();
        method.CaiQuan(10);

    }
}
//用Scanner输入自己的选择
class Method {
    public void CaiQuan(int i) {//i 表示猜拳总次数

        Random random = new Random();
        int m, n, y = 0;//m - Tom, n - computer ,y -赢的次数
        for (int j = 1; j <= i; j++) {//j表示循环次数
            m = random.nextInt(3);//范围(0~2)
            n = random.nextInt(3);
            System.out.println("第"+j+"次的结果为"+m+"\t"+n);
            if ((m == 0 && n == 1)
                    || (m == 1 && n == 2)//符合条件时赢得次数+1
                    || (m == 2 && n == 0)) {
                y++;
            }
        }
        System.out.println("最后结果为");
        System.out.println("Tom赢得次数为"+y+"输的次数"+(i - y));
    }
}
