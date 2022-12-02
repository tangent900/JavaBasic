package JavaBasic.Experiments_class.AnimalAbstract.AnimalInterface;

import java.util.Date;

/*
    3. 编写程序实现以下逻辑。
    ① 接口Animal具有一个抽象方法cry。
    ② 类Dog实现Animal接口，并实现cry方法。
    ③ 类Cat实现Animal接口并实现cry方法。
    编写测试类，分别实现接口实现多态，利用方法的Animal接口参数实现多态。
 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("曾繁宇");
        System.out.println(new Date());
        Cat cat = new Cat();
        cat.cry();
        Dog dog = new Dog();
        dog.cry();
        System.out.println("\u0041".matches("A\\\\"));
        System.out.println("A\\".matches("\u0041\\\\"));
//        JavaBasic.String s = new JavaBasic.String("\u0041\\");



    }
}
