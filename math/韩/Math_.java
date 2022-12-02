package JavaBasic.math.韩;
import java.lang.Math;
public class Math_ {
    public static void main(String[] args) {
//        取绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
//        乘方
        double pow = Math.pow(2,4);
        System.out.println(pow);
//        向下取整的小数
        double floor = Math.floor(5.1);
        System.out.println(floor);
//        向上取整的小数
        double ceil = Math.ceil(10.8);
        System.out.println(ceil);
//        四舍五入
        double rount = Math.round(5.8);
        System.out.println(rount);
//        开方
        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);
//        随机数  [0,1)
        double random = Math.random();
        System.out.println(random);
        System.out.println("==========");
//        JavaBasic.Exercise:生成一个 a ~ b(包括a，b)之间的随机整数  取a = 2，b = 7
//        公式 (int)a+Math.random()*(b - a + 1)
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)Math.floor( 2 + Math.random() * 6);
            System.out.println(randomNum);
        }
//      最大值与最小值  参数 [a,b]
        int max = Math.max(10,20);
        int min = Math.min(20,50);
        System.out.println(max  + " " + min);

    }
}
