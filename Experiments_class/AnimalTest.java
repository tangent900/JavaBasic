package JavaBasic.Experiments_class;

import java.util.Date;

/*
1. 编写程序实现以下逻辑。
① 类Animal具有一个实例方法cry。
② 类Dog继承Animal，并实现cry方法。
③ 类Cat继承Animal并实现cry方法。
编写测试类，分别实现利用上转型实现多态，利用Animal类参数实现多态。

 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("曾繁宇");
        System.out.println(new Date());
        Animal a1 = new Dog();
        a1.cry();
        Animal a2 = new Cat();
        a2.cry();
    }
}
